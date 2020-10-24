package com.mbds.newsletter.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mbds.newsletter.R
import com.mbds.newsletter.adapters.CategoriAdapter
import com.mbds.newsletter.model.Category


/**
 * A simple [Fragment] subclass.
 * Use the [CategoriesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CategoriesFragement : Fragment() {

    override fun onCreateView (
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_categories, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view)
        val articles: List<Category> = listOf<Category>(
                    Category("Politique", "https://picsum.photos/500/300"),
                    Category("Sport", "https://picsum.photos/500/300"),
                    Category("Sante", "https://picsum.photos/500/300"),
                    Category("News", "https://picsum.photos/500/300"),
                    Category("Urgent", "https://picsum.photos/500/300"),
                    Category("Annonce", "https://picsum.photos/500/300"),
                    Category("Economie", "https://picsum.photos/500/300")
            )
            val adapterRecycler = CategoriAdapter(articles)
        recyclerView.hasFixedSize()
        recyclerView.layoutManager = LinearLayoutManager(view.context)
        recyclerView.adapter = adapterRecycler
    }
}