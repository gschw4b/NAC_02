package com.br.nac02

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.br.nac02.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var bindings: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindings = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        return bindings.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindings.next.setOnClickListener {
            val n1 = Integer.parseInt(bindings.input1.text.toString())
            val n2 = Integer.parseInt(bindings.input2.text.toString())
            val res = (n1 + n2)

            val action = HomeFragmentDirections.actionHomeFragmentToResultFragment(res)
            findNavController().navigate(action)
        }
    }

}