package org.d3ifcool.praassessment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import org.d3ifcool.praassessment.databinding.FragmentPersegiPanjangBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class PersegiPanjangFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding : FragmentPersegiPanjangBinding = DataBindingUtil.inflate(
            inflater,R.layout.fragment_persegi_panjang, container, false
        )
        binding.bHitungPersegi.setOnClickListener {
            var panjang = binding.etPanjangPersegi.text.toString().toDouble()
            var lebar = binding.etLebarPersegi.text.toString().toDouble()

            var luas = panjang * lebar
            var keliling = panjang * lebar * 2

            binding.tvLuasPersegi.text = "$luas"
            binding.tvKelilingPersegi.text = "$keliling"
        }
        return binding.root
    }


}
