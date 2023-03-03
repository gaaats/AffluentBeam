package com.tocaboca.tocalifeworldd.vfbghyhy

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tocaboca.tocalifeworldd.R


class OneneneiFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_onenenei, container, false)
    }

    private lateinit var hyhyhyhy: Context


    override fun onAttach(context: Context) {
        super.onAttach(context)
        hyhyhyhy=context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rhhfrhfrhrfgyfrygfrg()

    }

    private fun rhhfrhfrhrfgyfrygfrg() {
        ghgthigtitihgt()
    }

    private fun ghgthigtitihgt() {
        hgtihgthigthgt()
    }

    private fun hgtihgthigthgt() {
        findNavController().navigate(R.id.action_oneneneiFragment_to_tvooooFragment)
    }
}