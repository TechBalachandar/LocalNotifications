package com.balu.apps.localnotifications

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.balu.apps.localnotifications.services.CounterNotificationService

class CounterNotificationReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent?) {
        val service = CounterNotificationService(context)
        service.showNotification(++Counter.value)
    }
}