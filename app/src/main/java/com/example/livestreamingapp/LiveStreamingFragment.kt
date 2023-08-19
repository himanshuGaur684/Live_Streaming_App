package com.example.livestreamingapp

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.livestreamingapp.databinding.FragmentLiveStreamingBinding
import com.zegocloud.uikit.prebuilt.livestreaming.ZegoUIKitPrebuiltLiveStreamingConfig
import com.zegocloud.uikit.prebuilt.livestreaming.ZegoUIKitPrebuiltLiveStreamingFragment


class LiveStreamingFragment : Fragment() {

    private var _binding: FragmentLiveStreamingBinding? = null
    private val binding: FragmentLiveStreamingBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLiveStreamingBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val config = if (true) {
            ZegoUIKitPrebuiltLiveStreamingConfig.host()
        } else {
            ZegoUIKitPrebuiltLiveStreamingConfig.audience()
        }
        ZegoUIKitPrebuiltLiveStreamingFragment.newInstance(4324L, "ldfakj", "", "", "", config)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}