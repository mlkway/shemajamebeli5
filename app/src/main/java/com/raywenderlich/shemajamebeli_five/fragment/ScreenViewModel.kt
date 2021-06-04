package com.raywenderlich.shemajamebeli_five.fragment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.raywenderlich.shemajamebeli_five.network.NetworkService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ScreenViewModel : ViewModel() {

/*
    private val _data = MutableLiveData<Data()
    val data: LiveData<Data<DataSubList<List<DataSubListItem>>>>get() = _data*/


/*    private val _dataSublist = MutableLiveData<DataSubList>()
    val dataSubList: LiveData<DataSubList> get() = _dataSublist

    private val _dataSubListItem = MutableLiveData<DataSubListItem>()
    val dataSubListItem: LiveData<DataSubListItem> get() = _dataSubListItem*/


     fun load(){
         viewModelScope.launch {
            val data = withContext(Dispatchers.Main){
                NetworkService.personService.getPerson()
            }
            /*_data.postValue(data)*/



        }

    }



}