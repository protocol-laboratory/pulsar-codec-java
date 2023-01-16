package io.github.protocol.pulsar.codec;

import com.google.protobuf.InvalidProtocolBufferException;
import io.github.protocol.pulsar.codec.schema.SchemaStorageFormat;
import org.junit.jupiter.api.Test;

class DecodePulsarSchemaLocatorTest {

    public static final String CASE1 = "0a2b0800120508a91410001a20e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855122b0800120508a91410001a20e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";

    @Test
    public void decodeCase1() throws InvalidProtocolBufferException {
        byte[] data = HexUtil.hexToByteArray(CASE1);
        SchemaStorageFormat.SchemaLocator managedLedgerInfo = SchemaStorageFormat.SchemaLocator.parseFrom(data);
    }

}
