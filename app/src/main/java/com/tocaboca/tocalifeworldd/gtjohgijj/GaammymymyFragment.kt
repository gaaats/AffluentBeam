package com.tocaboca.tocalifeworldd.gtjohgijj

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.tocaboca.tocalifeworldd.R
import com.tocaboca.tocalifeworldd.databinding.FragmentGaammymymyBinding
import java.util.*


class GaammymymyFragment : Fragment() {


    val test = "ok"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGaammymymyBinding = FragmentGaammymymyBinding.inflate(inflater, container, false)
        return binding.root
    }

    var fragmentGaammymymyBinding: FragmentGaammymymyBinding? = null
    val binding
        get() = fragmentGaammymymyBinding
            ?: throw RuntimeException("FragmentGaammymymyBinding = null")


    val f1 = "erthyju"
    val f3 = "rgthyj"
    val f4 = "erhtjk"
    val f5 = "rgthyju"
    val f9 = "htyjk,"
    val f6 = "thyjuk"
    val f7 = "rtjyk"
    val f8 = "tyukloloollo"

    val ghyhyyhyh = f1 + f3 + f4 + f5 + f6 + f7 + f8 + f9

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            if (test == "fygrfggfrgrf") {
                val a = ghyhyyhyh
                Toast.makeText(requireContext(), "$ghyhyyhyh", Toast.LENGTH_SHORT).show()
            }

            if (System.currentTimeMillis() % 56 == Long.MIN_VALUE) {
                ofkrogjtitgjjtiogjitjjgtjgtji()
            } else {
                Log.d("loggggglo", "res")
            }

            gtgtgtjgttgj()

        } catch (e: Exception) {
            gtgtgt()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun ofkrogjtitgjjtiogjitjjgtjgtji() {
        Snackbar.make(
            binding.root,
            ghyhyyhyh,
            Snackbar.LENGTH_LONG
        ).show()
    }


    private fun gtgtgtjgttgj() {

        binding.btnPlayGameeeeeeeeeeee.setOnClickListener {
            fjrijijgtjgtjijgtijigtjgtj()
        }
    }

    private fun fjrijijgtjgtjijgtijigtjgtj() {
        findNavController().navigate(R.id.action_gaammymymyFragment_to_finishedFragment)
    }


    private fun gtgtgt() {
        rogtjgjijtjitgijgt()
        rfijrogtgijogijtjgitj()
    }

    private fun rfijrogtgijogijtjgitj() {
        requireActivity().onBackPressed()
    }

    private fun rogtjgjijtjitgijgt() {
        Snackbar.make(
            binding.root,
            "There is some error, try again",
            Snackbar.LENGTH_LONG
        ).show()
    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        fragmentGaammymymyBinding = null
        super.onDestroy()
    }

}