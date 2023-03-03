package com.tocaboca.tocalifeworldd.frhyhyjhy

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.tocaboca.tocalifeworldd.R
import com.tocaboca.tocalifeworldd.databinding.FragmentFinishedBinding
import com.tocaboca.tocalifeworldd.gaammama.OKfoorfkorfkfr
import com.tocaboca.tocalifeworldd.gaammama.Jifjrfjrfji
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random


class finishedFragment : Fragment() {

    private fun gtijgjtjigtjitgjtg(): List<OKfoorfkorfkfr> {
        val fkgtjigtjigtijgt = mutableListOf<OKfoorfkorfkfr>()
        for (i in 1..50) {
            fkgtjigtjigtijgt.add(
                OKfoorfkorfkfr(
                    Random.nextInt(Int.MAX_VALUE),
                    hy59hy5hy5hy5.random(),
                )
            )
        }
        return fkgtjigtjigtijgt
    }

    private fun gtgjitjjgjtgtjiijtg(): List<Int> {
        return listOf(
            R.drawable.f1,
            R.drawable.f2,
            R.drawable.f3,
            R.drawable.f4,
            R.drawable.f5,
            R.drawable.f6,
            R.drawable.f8
        )
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        if (hy59hy59ju59uj == "gtgtgtgtgttgthjujikkkiigtgt"){
            gtjigtjtgjigt()
        }

        hy5hy5hy5hy5()
        val gtgijtijtgitg = fragmentFinishedBinding.recVLeft.layoutManager as LinearLayoutManager
        val rgjithgtuhtg = fragmentFinishedBinding.recVCenter.layoutManager as LinearLayoutManager
        val difrfrfrr5 = fragmentFinishedBinding.recVRight.layoutManager as LinearLayoutManager

        hy5h5yhy5()
        hy5hy59hy59hy59hy()
        hy59hy59hy59hy59()

        gtuhgtgthgtddhdgdgd(
            gtgijtijtgitg,
            rgjithgtuhtg,
            difrfrfrr5
        )
        super.onViewCreated(view, savedInstanceState)
    }

    private fun gtjigtjtgjigt() {
        Snackbar.make(
            fragmentFinishedBinding.root,
            "You win $hy59959j5ju5ju59uj points",
            Snackbar.LENGTH_LONG
        ).show()
    }

    private val hyju6ju5u5 = Jifjrfjrfji()
    private val hhyyh = Jifjrfjrfji()


    private var frgyhyjuji: FragmentFinishedBinding? = null
    private val ftgtgtg = Jifjrfjrfji()

    private fun gtuhgtgthgtddhdgdgd(
        linearLayoutManagerLeftdferfgtghyt: LinearLayoutManager,
        linearLayoutManagerCenterrrrrrrr: LinearLayoutManager,
        frgthyhyhyyh: LinearLayoutManager
    ) {
        tgijtjgtgjtijitg(
            linearLayoutManagerLeftdferfgtghyt,
            linearLayoutManagerCenterrrrrrrr,
            frgthyhyhyyh
        )
    }

    private fun tgijtjgtgjtijitg(
        linearLayoutManagerLeftdferfgtghyt: LinearLayoutManager,
        linearLayoutManagerCenterrrrrrrr: LinearLayoutManager,
        frgthyhyhyyh: LinearLayoutManager
    ) {
        fragmentFinishedBinding.btnGoSpin.setOnClickListener {
            gtitgjgtjjgtjtgji(linearLayoutManagerLeftdferfgtghyt, 8, 12)
            gtitgjgtjjgtjtgji(linearLayoutManagerCenterrrrrrrr, 12, 18)
            gtitgjgtjjgtjtgji(frgthyhyhyyh, 20, 27)
        }
    }


    private fun hy5hy5hy5hy5() {
        fragmentFinishedBinding.btnImgExittttttMoney.setOnClickListener {
            fuhhuhfrurfhuhrhurf()
        }
    }

    private fun fuhhuhfrurfhuhrhurf() {
        findNavController().navigate(R.id.action_finishedFragment_to_gaammymymyFragment)
    }


    private fun hy59hy59hy59hy59() {
        hyju6ju5u5.submitList(gtijgjtjigtjitgjtg())
        hhyyh.submitList(gtijgjtjigtjitgjtg())
        ftgtgtg.submitList(gtijgjtjigtjitgjtg())
    }

    override fun onDestroy() {
        frgyhyjuji = null
        super.onDestroy()
    }




    @SuppressLint("ClickableViewAccessibility")
    private fun hy5h5yhy5() {
        fragmentFinishedBinding.recVLeft.setOnTouchListener { _, _ -> true }
        fragmentFinishedBinding.recVRight.setOnTouchListener { _, _ -> true }
        fragmentFinishedBinding.recVCenter.setOnTouchListener { _, _ -> true }
    }

    val hy5hy5hy5 by lazy {
        listOf(

            "Noah bonus",
            "Oliver bonus",
            "Elijah bonus",
            "James bonus",
            "William bonus",
            "Benjamin bonus",
            "Lucas bonus",
            "Henry bonus",
            "Theodore bonus",
            "Jack bonus",
            "Levi bonus",
            "Alexander bonus",
            "Jackson bonus",
            "Mateo bonus",
            "Daniel bonus",
            "Michael bonus",
            "Mason bonus",
            "Sebastian bonus",
            "Ethan bonus",
            "Logan bonus",
            "Owen bonus",
            "Samuel bonus",
            "Jacob bonus",
            "Asher bonus",
            "Aiden bonus",
            "John bonus",
            "Joseph bonus"

        )
    }


    private fun gtitgjgtjjgtjtgji(
        ghyhhyhyhyhy: LinearLayoutManager,
        gtggtjijttgjgt: Int,
        gjtigjgtjigtji: Int
    ) {
        lifecycleScope.launch {
            val hyhyy5 = Random.nextInt(gtggtjijttgjgt, gjtigjgtjigtji)
            var gt5gt5gt = 100L
            for (i in 1..hyhyy5) {
                ghyhhyhyhyhy.scrollToPositionWithOffset(i, 0)
                delay(gt5gt5gt)
                gt5gt5gt += 5
            }
            if (gjtigjgtjigtji == 27) {
                Snackbar.make(
                    fragmentFinishedBinding.root,
                    "${hy5hy5hy5.random()}, You earned ${Random.nextInt(from = 100, until = 4000)} points",
                    Snackbar.LENGTH_LONG
                ).show()
            }
        }
    }


    private fun hy5hy59hy59hy59hy() {
        fragmentFinishedBinding.recVLeft.adapter = hyju6ju5u5
        fragmentFinishedBinding.recVRight.adapter = hhyyh
        fragmentFinishedBinding.recVCenter.adapter = ftgtgtg
    }





    val hy59hy59ju59uj = "gtgtgttggt"

    val hy59hy595 = "sasffrrffr"
    val hy59hy5hy5 = "sasffgtgttggtrrffr"
    val hy59hy5hy55hy = "sasfrgtffrrffr"
    val f5 = "sasffrgttgrffr"
    val f9 = "sasffrrffr"
    val hy59hy59hy59hy = "sasffgtgtrrffr"
    val h22ju226ju262ju = "sasffrrffr"
    val f8 = "sasffrgtgtgtrffr"

    val hy59959j5ju5ju59uj = hy59hy595 +hy59hy5hy5+hy59hy5hy55hy+f5+hy59hy59hy59hy+h22ju226ju262ju+f8+f9

    private val hy59hy5hy5hy5 = gtgjitjjgjtgtjiijtg()
    private val fragmentFinishedBinding get() = frgyhyjuji ?: throw RuntimeException("FragmentFinishedBinding = null")

    private var tgtgtgt5 = 300

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        frgyhyjuji = FragmentFinishedBinding.inflate(inflater, container, false)
        return fragmentFinishedBinding.root
    }

}