package com.tocaboca.tocalifeworldd.frhyhyjhy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.tocaboca.tocalifeworldd.R
import com.tocaboca.tocalifeworldd.databinding.FragmentFinishedBinding


class finishedFragment : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            gtjogtjigtjiogtjiogtjoigt()


        } catch (e: Exception) {
            vfvvf()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun gtjogtjigtjiogtjiogtjoigt() {
        rffrfrrfhuirfhrf()

        gtjogtjogtjiogtijo()

        gjogtigtijgtjigt()
    }

    private fun gjogtigtijgtjigt() {
        binding.dovn.setOnClickListener {
            gtjgtigtigtgtgt()
            findNavController().navigate(R.id.action_finishedFragment_to_gaammymymyFragment)
        }
    }

    private fun gtjogtjogtjiogtijo() {
        binding.center.setOnClickListener {
            gtjgtigtigtgtgt()
            findNavController().navigate(R.id.action_finishedFragment_to_gaammymymyFragment)
        }
    }

    private fun rffrfrrfhuirfhrf() {
        binding.top.setOnClickListener {
            gtjgtigtigtgtgt()
            findNavController().navigate(R.id.action_finishedFragment_to_gaammymymyFragment)
        }
    }

    private fun gtjgtigtigtgtgt() {
        Toast.makeText(requireContext(), "Done. Reloading game...", Toast.LENGTH_SHORT).show()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentFinishedBinding =
            FragmentFinishedBinding.inflate(inflater, container, false)
        return binding.root
    }


    private fun vfvvf() {
        Snackbar.make(
            binding.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var fragmentFinishedBinding: FragmentFinishedBinding? = null
    private val binding
        get() = fragmentFinishedBinding
            ?: throw RuntimeException("FragmentFinishedBinding = null")


    override fun onPause() {

        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        fragmentFinishedBinding = null
        super.onDestroy()
    }
}