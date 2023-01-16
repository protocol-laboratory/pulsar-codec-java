# pulsar-codec-java
helpful codec utilities for [pulsar](https://pulsar.apache.org/), typically used in troubleshooting or lightweight decode/encode.
## where does the proto file come from?
Now the proto file is from [apache/pulsar](https://pulsar.apche.org/), v2.11.0
```bash
curl -OL https://raw.githubusercontent.com/apache/pulsar/v2.11.0/managed-ledger/src/main/proto/MLDataFormats.proto
curl -OL https://raw.githubusercontent.com/apache/pulsar/v2.11.0/pulsar-common/src/main/proto/PulsarApi.proto
curl -OL https://raw.githubusercontent.com/apache/pulsar/v2.11.0/pulsar-broker/src/main/proto/SchemaStorageFormat.proto
```
