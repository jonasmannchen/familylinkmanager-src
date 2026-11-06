package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gku {

    @Deprecated
    public static final glx a = glx.a("canonical_status");

    @Deprecated
    public static final glx b = glx.a("method");

    @Deprecated
    public static final glc c;

    @Deprecated
    public static final glb d;

    @Deprecated
    public static final glb e;

    @Deprecated
    public static final glb f;

    @Deprecated
    public static final glb g;

    @Deprecated
    public static final glb h;

    @Deprecated
    public static final glc i;

    @Deprecated
    public static final glc j;

    @Deprecated
    public static final glc k;

    @Deprecated
    public static final glc l;

    static {
        glx.a("grpc_client_status");
        glx.a("grpc_server_status");
        glx.a("grpc_client_method");
        glx.a("grpc_server_method");
        c = glc.a("grpc.io/client/error_count", "RPC Errors", "1");
        d = glb.a("grpc.io/client/request_bytes", "Request bytes", "By");
        e = glb.a("grpc.io/client/response_bytes", "Response bytes", "By");
        f = glb.a("grpc.io/client/roundtrip_latency", "RPC roundtrip latency msec", "ms");
        glb.a("grpc.io/client/server_elapsed_time", "Server elapsed time in msecs", "ms");
        g = glb.a("grpc.io/client/uncompressed_request_bytes", "Uncompressed Request bytes", "By");
        h = glb.a("grpc.io/client/uncompressed_response_bytes", "Uncompressed Response bytes", "By");
        i = glc.a("grpc.io/client/started_count", "Number of client RPCs (streams) started", "1");
        j = glc.a("grpc.io/client/finished_count", "Number of client RPCs (streams) finished", "1");
        k = glc.a("grpc.io/client/request_count", "Number of client RPC request messages", "1");
        l = glc.a("grpc.io/client/response_count", "Number of client RPC response messages", "1");
        glb.a("grpc.io/client/sent_bytes_per_rpc", "Total bytes sent across all request messages per RPC", "By");
        glb.a("grpc.io/client/received_bytes_per_rpc", "Total bytes received across all response messages per RPC", "By");
        glb.a("grpc.io/client/roundtrip_latency", "Time between first byte of request sent to last byte of response received, or terminal error.", "ms");
        glc.a("grpc.io/client/sent_messages_per_rpc", "Number of messages sent in the RPC", "1");
        glc.a("grpc.io/client/received_messages_per_rpc", "Number of response messages received per RPC", "1");
        glb.a("grpc.io/client/server_latency", "Server latency in msecs", "ms");
        glc.a("grpc.io/client/started_rpcs", "Number of started client RPCs.", "1");
        glc.a("grpc.io/server/error_count", "RPC Errors", "1");
        glb.a("grpc.io/server/request_bytes", "Request bytes", "By");
        glb.a("grpc.io/server/response_bytes", "Response bytes", "By");
        glb.a("grpc.io/server/server_elapsed_time", "Server elapsed time in msecs", "ms");
        glb.a("grpc.io/server/server_latency", "Latency in msecs", "ms");
        glb.a("grpc.io/server/uncompressed_request_bytes", "Uncompressed Request bytes", "By");
        glb.a("grpc.io/server/uncompressed_response_bytes", "Uncompressed Response bytes", "By");
        glc.a("grpc.io/server/started_count", "Number of server RPCs (streams) started", "1");
        glc.a("grpc.io/server/finished_count", "Number of server RPCs (streams) finished", "1");
        glc.a("grpc.io/server/request_count", "Number of server RPC request messages", "1");
        glc.a("grpc.io/server/response_count", "Number of server RPC response messages", "1");
        glb.a("grpc.io/server/sent_bytes_per_rpc", "Total bytes sent across all response messages per RPC", "By");
        glb.a("grpc.io/server/received_bytes_per_rpc", "Total bytes received across all messages per RPC", "By");
        glc.a("grpc.io/server/sent_messages_per_rpc", "Number of messages sent in each RPC", "1");
        glc.a("grpc.io/server/received_messages_per_rpc", "Number of messages received in each RPC", "1");
        glb.a("grpc.io/server/server_latency", "Time between first byte of request received to last byte of response sent, or terminal error.", "ms");
        glc.a("grpc.io/server/started_rpcs", "Number of started server RPCs.", "1");
    }
}
