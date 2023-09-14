package com.example.youtube.ui.player

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.youtube.databinding.FragmentCustomDialogBinding


@Suppress("UNREACHABLE_CODE")
class CustomDialogFragment : DialogFragment() {

    private lateinit var binding: FragmentCustomDialogBinding

        override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCustomDialogBinding.inflate(inflater, container, false)
        return binding.root
        initClickListener()

    }


    private fun initClickListener() {
        with(binding) {

            btnClose.setOnClickListener{
                dismiss()

            }
            btnDownload.setOnClickListener{
                dialog?.cancel()
                dismiss()
            }
        }
    }
}

