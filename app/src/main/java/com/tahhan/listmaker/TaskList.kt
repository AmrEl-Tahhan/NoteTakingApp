package com.tahhan.listmaker

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class TaskList(val name: String , val tasks: ArrayList<String> = ArrayList()) : Parcelable {

}