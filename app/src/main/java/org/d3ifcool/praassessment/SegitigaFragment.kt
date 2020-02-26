package org.d3ifcool.praassessment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import org.d3ifcool.praassessment.databinding.FragmentPersegiPanjangBinding
import org.d3ifcool.praassessment.databinding.FragmentSegitigaBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class SegitigaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding : FragmentSegitigaBinding = DataBindingUtil.inflate(
            inflater,R.layout.fragment_segitiga, container, false
        )
        binding.bHitungSegitiga.setOnClickListener {
            var Alas = binding.etAlasSegitiga.text.toString().toDouble()
            var Tinggi = binding.etTinggiSegitiga.text.toString().toDouble()

            var luas = 0.5 * Alas * Tinggi
            var keliling =  Alas + Tinggi + (Math.hypot(Alas,Tinggi))



            binding.tvLuasSegitiga.text = "$luas"
            binding.tvKelilingSegitiga.text = "$keliling"
        }
        return binding.root
    }


}
