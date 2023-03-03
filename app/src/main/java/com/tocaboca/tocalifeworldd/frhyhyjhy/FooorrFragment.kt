package com.tocaboca.tocalifeworldd.frhyhyjhy

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.tocaboca.tocalifeworldd.R
import com.tocaboca.tocalifeworldd.edfrgtr.KOfrkorfkorgtgt.nhyjiohyiohy5
import com.tocaboca.tocalifeworldd.fregrtyh.OKokooooo
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class FooorrFragment : Fragment() {
    val gthgtgthuggt by activityViewModel<OKokooooo>(named("MainModel"))
    val sharePgtgtgt: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var gtgthigthgthugt: String
    private lateinit var mContextgtgtgt: Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContextgtgtgt = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fooorr, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val g5t955gt595gt = sharePgtgtgt.getString(nhyjiohyiohy5, null)
        val hyhyhyhyhy = sharePgtgtgt.getString("appCamp", null)

        if (g5t955gt595gt=="1" &&hyhyhyhyhy == null) {
            gthgtgthuggt.gtthyhyhy(mContextgtgtgt)
            gthgtgthuggt.hyjuikikik.observe(viewLifecycleOwner) {
                if (it != null) {
                    gtgthigthgthugt = it.toString()
                    sharePgtgtgt.edit().putString("appCamp", gtgthigthgthugt).apply()
                    findNavController().navigate(R.id.action_fooorrFragment_to_fiveeeFragment)
                }
            }
        } else {
            findNavController().navigate(R.id.action_fooorrFragment_to_fiveeeFragment)
        }
    }


}