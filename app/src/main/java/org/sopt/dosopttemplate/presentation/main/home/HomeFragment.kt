package org.sopt.dosopttemplate.presentation.main.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import org.sopt.dosopttemplate.data.adapter.FriendAdapter
import org.sopt.dosopttemplate.data.mock.ViewModel
import org.sopt.dosopttemplate.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }
    private val viewModel by viewModels<ViewModel>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val friendAdapter = FriendAdapter(requireContext())

        binding.rvFriends.adapter = friendAdapter
        friendAdapter.setFriendList(viewModel.mockFriend)
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
