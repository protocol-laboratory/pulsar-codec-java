package io.github.protocol.pulsar.codec;

import com.google.protobuf.InvalidProtocolBufferException;
import io.github.protocol.pulsar.codec.mledger.MLDataFormats;
import org.junit.jupiter.api.Test;

class DecodeManagedLedgerTopicTest {

    public static final String CASE1 = "0a0508da012000";

    @Test
    public void decodeCase1() throws InvalidProtocolBufferException {
        byte[] data = HexUtil.hexToByteArray(CASE1);
        MLDataFormats.ManagedLedgerInfo managedLedgerInfo = MLDataFormats.ManagedLedgerInfo.parseFrom(data);
    }

}
