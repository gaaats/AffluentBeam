package com.tocaboca.tocalifeworldd.frhyhyjhy

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.appsflyer.AppsFlyerLib
import com.tocaboca.tocalifeworldd.gtjohgijj.GamtmtmtmmtActivity2
import com.tocaboca.tocalifeworldd.R
import com.tocaboca.tocalifeworldd.vfbghyhyhy.VeboboboboboActivity2
import com.tocaboca.tocalifeworldd.edfrgtr.KOfrkorfkorgtgt.ju26ju26j
import com.tocaboca.tocalifeworldd.edfrgtr.KOfrkorfkorgtgt.ju26ju26uj2
import com.tocaboca.tocalifeworldd.edfrgtr.KOfrkorfkorgtgt.u2k2ik2ik2
import com.tocaboca.tocalifeworldd.edfrgtr.KOfrkorfkorgtgt.codeCodegtgt
import com.tocaboca.tocalifeworldd.edfrgtr.KOfrkorfkorgtgt.ghyhy9555
import com.tocaboca.tocalifeworldd.edfrgtr.KOfrkorfkorgtgt.gtgthtghgthugt
import com.tocaboca.tocalifeworldd.edfrgtr.KOfrkorfkorgtgt.gthgthugtuugthugt
import com.tocaboca.tocalifeworldd.edfrgtr.KOfrkorfkorgtgt.gthyhjyhyjuuj
import com.tocaboca.tocalifeworldd.edfrgtr.KOfrkorfkorgtgt.gtitghugt
import com.tocaboca.tocalifeworldd.edfrgtr.KOfrkorfkorgtgt.hy62ujj9
import com.tocaboca.tocalifeworldd.edfrgtr.KOfrkorfkorgtgt.instIdgttg
import com.tocaboca.tocalifeworldd.edfrgtr.KOfrkorfkorgtgt.nhyjiohyiohy5
import com.tocaboca.tocalifeworldd.edfrgtr.KOfrkorfkorgtgt.onegtgt
import com.tocaboca.tocalifeworldd.edfrgtr.KOfrkorfkorgtgt.trolologttggt
import com.tocaboca.tocalifeworldd.edfrgtr.KOfrkorfkorgtgt.vbfbbrfgfrggrffr
import com.tocaboca.tocalifeworldd.edfrgtr.KOfrkorfkorgtgt.vbfbfrrfhrfhfrhfrfr
import com.tocaboca.tocalifeworldd.edfrgtr.KOfrkorfkorgtgt.vfbhbfryurfgrfrf
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class FiveeeFragment : Fragment() {
    private fun rfhihfrhrfhfrhrfhihrf() {
        AppsFlyerLib.getInstance().setCollectAndroidID(true)
    }

    override fun onStart() {
        super.onStart()


        val gtgtgt: String? = shareP.getString(instIdgttg, null)
        val bgnbnbgnbguhbghg = shareP.getString("deepSt", null)
        val hjoihhfrfrgfrrg = shareP.getString(codeCodegtgt, null)
        val hihfhgtgthgt = shareP.getString(nhyjiohyiohy5, null)
        val vbffrygfrrfgrfg = shareP.getString(ju26ju26uj2, null)
        val gjgtojgt = shareP.getString(gtgthtghgthugt, null)
        val gthgtigthgthgt = u2k2ik2ik2
        val gtojigtjtgjgtjigtj = Build.VERSION.RELEASE
        val cdvdetfedfedffedfed = shareP.getString(ju26ju26j, null)
        val gthutguhugthgtgtgt = shareP.getString("appCamp", null)
        val bngngughgthugt = shareP.getString("mainId", null)

        val fhrirfurfuhrf = Intent(activity, VeboboboboboActivity2::class.java)
        val vfbfryrfgfrgfgrgfrrfrf = Intent(activity, GamtmtmtmmtActivity2::class.java)

        val afIdhyhyhy = AppsFlyerLib.getInstance().getAppsFlyerUID(mContext)
        rfhihfrhrfhfrhrfhihrf()

        shareP.edit().putString(hy62ujj9, afIdhyhyhy).apply()

        val gngnufhhth =
            "$vbffrygfrrfgrfg$vbfbbrfgfrggrffr$gthutguhugthgtgtgt&$onegtgt$afIdhyhyhy&$vfbhbfryurfgrfrf$bngngughgthugt&$gthgthugtuugthugt$gthgtigthgthgt&$vbfbfrrfhrfhfrhfrfr$gtojigtjtgjgtjigtj&$ghyhy9555$gthyhjyhyjuuj"
        val cdvedtdeffdeed =
            "$vbffrygfrrfgrfg$onegtgt$cdvdetfedfedffedfed&$vfbhbfryurfgrfrf$gtgtgt&$gthgthugtuugthugt$gthgtigthgthgt&$vbfbfrrfhrfhfrhfrfr$gtojigtjtgjgtjigtj&$ghyhy9555$gthyhjyhyjuuj"
        val vbyrfgrfrfg =
            "$vbffrygfrrfgrfg$vbfbbrfgfrggrffr$bgnbnbgnbguhbghg&$onegtgt$afIdhyhyhy&$vfbhbfryurfgrfrf$bngngughgthugt&$gthgthugtuugthugt$gthgtigthgthgt&$vbfbfrrfhrfhfrhfrfr$gtojigtjtgjgtjigtj&$ghyhy9555$trolologttggt"
        val bmgjhyjhyjojihy =
            "$vbffrygfrrfgrfg$vbfbbrfgfrggrffr$bgnbnbgnbguhbghg&$onegtgt$cdvdetfedfedffedfed&$vfbhbfryurfgrfrf$gtgtgt&$gthgthugtuugthugt$gthgtigthgthgt&$vbfbfrrfhrfhfrhfrfr$gtojigtjtgjgtjigtj&$ghyhy9555$trolologttggt"

        when (hihfhgtgthgt) {
            "1" ->
                if (gthutguhugthgtgtgt != "null") {
                    shareP.edit().putString(gtitghugt, gngnufhhth).apply()
                    shareP.edit().putString("WebInt", "campaign").apply()
                    startActivity(fhrirfurfuhrf)
                    activity?.finish()
                } else if (bgnbnbgnbguhbghg != null || hjoihhfrfrgfrrg!!.contains(gjgtojgt.toString())) {
                    shareP.edit().putString(gtitghugt, vbyrfgrfrfg).apply()
                    shareP.edit().putString("WebInt", "deepLink").apply()
                    startActivity(fhrirfurfuhrf)
                    activity?.finish()
                } else {
                    startActivity(vfbfryrfgfrgfgrgfrrfrf)
                    activity?.finish()
                }
            "0" ->
                if (bgnbnbgnbguhbghg != null) {
                    shareP.edit().putString(gtitghugt, bmgjhyjhyjojihy).apply()
                    shareP.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(fhrirfurfuhrf)
                    activity?.finish()
                } else if (hjoihhfrfrgfrrg!!.contains(gjgtojgt.toString())) {
                    shareP.edit().putString(gtitghugt, cdvedtdeffdeed).apply()
                    shareP.edit().putString("WebInt", "geo").apply()
                    startActivity(fhrirfurfuhrf)
                    activity?.finish()
                } else {
                    startActivity(vfbfryrfgfrgfgrgfrrfrf)
                    activity?.finish()
                }
        }
    }

    private lateinit var mContext: Context
    val shareP: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fiveee, container, false)
    }
}