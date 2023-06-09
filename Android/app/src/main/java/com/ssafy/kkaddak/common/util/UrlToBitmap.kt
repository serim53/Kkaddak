package com.ssafy.kkaddak.common.util

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.AsyncTask
import java.io.IOException
import java.net.URL

class UrlToBitmap(private val listener: UrlToBitmapListener) : AsyncTask<String, Void, Bitmap?>() {

    interface UrlToBitmapListener {
        fun onSuccess(bitmap: Bitmap?)
        fun onError(e: Exception)
    }

    @Deprecated("Deprecated in Java")
    override fun doInBackground(vararg params: String): Bitmap? {
        try {
            val url = URL(params[0])
            val inputStream = url.openConnection().getInputStream()
            return BitmapFactory.decodeStream(inputStream)
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return null
    }

    @Deprecated("Deprecated in Java")
    override fun onPostExecute(result: Bitmap?) {
        super.onPostExecute(result)
        listener.onSuccess(result)
    }
}