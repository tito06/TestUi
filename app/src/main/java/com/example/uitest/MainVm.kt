package com.example.uitest

import androidx.lifecycle.ViewModel

class MainVm :ViewModel() {

    val image = listOf(
        ImageList(R.drawable.coco),
        ImageList(R.drawable.coco),
        ImageList(R.drawable.coco),
        ImageList(R.drawable.coco)
    )

    val Titlr = listOf(
        ListName("Test Name", "Test", R.drawable.coco),
        ListName("Test Name", "Test", R.drawable.coco),
        ListName("Test Name", "Test", R.drawable.coco),
        ListName("Test Name", "Test", R.drawable.coco),
        ListName("Test Name", "Test", R.drawable.coco),
        ListName("Test Name", "Test", R.drawable.coco),
        ListName("Test Name", "Test", R.drawable.coco),
        ListName("Test Name", "Test", R.drawable.coco),
        ListName("Test Name", "Test", R.drawable.coco),
    )

    val simpleList = listOf(
        "Item 1", "Item 2", "Item 3", "Item 4", "Item 5"
    )



    fun filteredTitlr(query: String): List<ListName> {
        return if (query.isEmpty()) {
            Titlr
        } else {
            Titlr.filter {
                it.name.contains(query, ignoreCase = true) || it.subTitle.contains(query, ignoreCase = true)
            }
        }
    }
}