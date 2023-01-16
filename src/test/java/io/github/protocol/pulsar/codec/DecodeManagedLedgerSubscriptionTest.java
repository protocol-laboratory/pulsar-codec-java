package io.github.protocol.pulsar.codec;

import com.google.protobuf.InvalidProtocolBufferException;
import io.github.protocol.pulsar.codec.mledger.MLDataFormats;
import org.junit.jupiter.api.Test;

class DecodeManagedLedgerSubscriptionTest {

    public static final String CASE1 = "08db0110da0118eeeeeeeeeeeeeeeeee0130e09cdd-3bd30";

    @Test
    public void decodeCase1() throws InvalidProtocolBufferException {
        byte[] data = HexUtil.hexToByteArray(CASE1);
        MLDataFormats.ManagedCursorInfo managedCursorInfo = MLDataFormats.ManagedCursorInfo.parseFrom(data);
    }

}
