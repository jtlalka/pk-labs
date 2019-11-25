package net.tlalka.pklab.network

import android.util.Log

// TODO: Create singleton injector [NetworkHeavyApiInjector] which will be lazy initialized.
class NetworkHeavyApi {

    private var intArray: IntArray = IntArray(1000001)

    // some heavy initialization
    init {
        for (i in 0..1000000) {
            intArray[i] = i
        }
    }

    fun rateProject(id: Int) {
        Log.d("Network", "Rate project id = $id")
    }
}