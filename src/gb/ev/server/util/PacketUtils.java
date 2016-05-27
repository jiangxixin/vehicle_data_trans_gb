package gb.ev.server.util;

import io.netty.buffer.ByteBuf;

public class PacketUtils {

	public static void copyBytesToBuf(byte[] src,ByteBuf dst,int dstSize){
		if(src == null){
			return;
		}
		if(dst == null){
			return;
		}
		if(src.length<=dstSize){
			dst.writeBytes(src);
			dst.writeZero(dstSize-src.length);
		}else{
			dst.writeBytes(src, 0, dstSize);
		}
	}
}
