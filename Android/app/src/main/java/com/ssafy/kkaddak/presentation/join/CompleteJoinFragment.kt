package com.ssafy.kkaddak.presentation.join

import com.ssafy.kkaddak.R
import com.ssafy.kkaddak.common.util.fadeOutView
import com.ssafy.kkaddak.databinding.FragmentCompleteJoinBinding
import com.ssafy.kkaddak.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class CompleteJoinFragment :
    BaseFragment<FragmentCompleteJoinBinding>(R.layout.fragment_complete_join) {
    override fun initView() {
        CoroutineScope(Dispatchers.Main).launch {
            delay(1000)
            fadeOutView(binding.clWelcomeKkaddak, requireContext())
            delay(1000)
            navigate(CompleteJoinFragmentDirections.actionCompleteJoinFragmentToMainActivity())
        }
    }
}