package com.tocaboca.tocalifeworldd.bgnhhyhy

import android.app.Application
import android.content.Context
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.tocaboca.tocalifeworldd.edfrgtr.KOfrkorfkorgtgt.ju26ju26j
import com.tocaboca.tocalifeworldd.edfrgtr.KOfrkorfkorgtgt.g2huj2uj6uj
import com.tocaboca.tocalifeworldd.edfrgtr.KOfrkorfkorgtgt.instIdgttg
import com.tocaboca.tocalifeworldd.edfrgtr.KOfrkorfkorgtgt.ju26ju26ju26ik
import com.tocaboca.tocalifeworldd.frfggthyhy.bgbgnhhy5995uj5ju
import com.tocaboca.tocalifeworldd.frfggthyhy.hhy5hy595hy95hy
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class Sooopeppeeo:Application() {
    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        gtjogtjogtjgtjiogt()

        val hy2h2y = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val cfv2gv = getSharedPreferences("PREFS_NAME", 0)

        val bg2nh2jju = MyTracker.getTrackerParams()
        val h2juj2u6 = MyTracker.getTrackerConfig()
        val nhmikki95 = MyTracker.getInstanceId(this)
        h2juj2u6.isTrackingLaunchEnabled = true
        val bgn9j59uj59 = UUID.randomUUID().toString()

        if (cfv2gv.getBoolean("my_first_time", true)) {
            bg2nh2jju.setCustomUserId(bgn9j59uj59)
            hy2h2y.edit().putString(ju26ju26j, bgn9j59uj59).apply()
            hy2h2y.edit().putString(instIdgttg, nhmikki95).apply()
            cfv2gv.edit().putBoolean("my_first_time", false).apply()
        } else {
            val hy2j2uk2kiki = hy2h2y.getString(ju26ju26j, bgn9j59uj59)
            bg2nh2jju.setCustomUserId(hy2j2uk2kiki)
        }
        MyTracker.initTracker(g2huj2uj6uj, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@Sooopeppeeo)
            modules(
                listOf(
                    bgbgnhhy5995uj5ju, hhy5hy595hy95hy
                )
            )
        }
    }

    private fun gtjogtjogtjgtjiogt() {
        OneSignal.setAppId(ju26ju26ju26ik)
    }

}