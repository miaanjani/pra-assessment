package org.d3ifcool.praassessment


import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import org.d3ifcool.praassessment.databinding.FragmentMainBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */


    class MainFragment : Fragment() {
        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            val binding: FragmentMainBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_main, container, false
            )
            binding.bRSegitiga.setOnClickListener {
                it.findNavController().navigate(R.id.action_mainFragment_to_persegiPanjangFragment)
            }
            binding.bRPersegi.setOnClickListener {
                it.findNavController().navigate(R.id.action_mainFragment_to_segitigaFragment)
            }
            setHasOptionsMenu(true)
            return binding.root
        }


    }
