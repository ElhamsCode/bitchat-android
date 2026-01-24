package com.bitchat


import com.bitchat.android.mesh.PacketProcessor
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import com.bitchat.android.model.RoutedPacket
import com.bitchat.android.protocol.BitchatPacket
import com.bitchat.android.model.BitchatMessage
import com.bitchat.android.model.BitchatMessageType
import com.bitchat.android.protocol.MessageType
import java.util.Date

@RunWith(RobolectricTestRunner::class)
class MessageTest {

    @Test
    fun 'Handling message packets should be measureable'() {
        // RoutedPacket implementation

        /*
        val message = BitchatMessage(
            id = "test1",
            sender = "alice",
            senderPeerID = "1234abcd",
            content = "📷 sent an image", // This would be the result of the utility function
            type = BitchatMessageType.Message,
            timestamp = Date(System.currentTimeMillis()),
            isPrivate = true
        )

        val routedPacket = RoutedPacket(
            packet = message,
            peerID = TODO(),
            relayAddress = TODO()
        )

         */


    }



}
