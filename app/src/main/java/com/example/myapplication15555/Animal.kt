package com.example.myapplication15555

import android.os.Parcel
import android.os.Parcelable
import android.provider.ContactsContract.RawContacts.Data

class Animal(): Parcelable {
    private var poroda:String = ""
    private var godimecag:Int = 0

    constructor(parcel: Parcel) : this() {
        poroda = parcel.readString().toString()
        godimecag = parcel.readInt()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(poroda)
        parcel.writeInt(godimecag)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Animal> {
        override fun createFromParcel(parcel: Parcel): Animal {
            return Animal(parcel)
        }

        override fun newArray(size: Int): Array<Animal?> {
            return arrayOfNulls(size)
        }
    }
    constructor(_poroda:String,_godimecag:Int): this(){
        poroda = _poroda
        godimecag = _godimecag
    }
    fun setPoroda(_poroda: String){
        poroda=_poroda
    }
    fun getPoroda():String{
        return poroda
    }
    fun setGodimecag(_godimecag: Int){
        godimecag=_godimecag
    }
    fun getGodimecag():Int{
        return  godimecag
    }
}