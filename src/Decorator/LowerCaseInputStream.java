package Decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/**
 * 装饰者模式例子
 * 功能：此装饰者把输入流内的所有大写字符转成小写。
 * @author LIn
 *
 */
public class LowerCaseInputStream extends FilterInputStream {
	public LowerCaseInputStream(InputStream in){
		super(in);
	}
	
	public int read() throws IOException{
		int c = super.read();
		return (c == -1 ? c : Character.toLowerCase((char)c));
	}
	
	public int read(byte[] b, int offset, int len) throws IOException {
		int result = super.read(b, offset, len);
		for(int i = offset; i < offset + result; i++){
			b[i] = (byte) Character.toLowerCase((char)b[i]);
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		int c;
		try {
			InputStream in = new LowerCaseInputStream(
					new BufferedInputStream(new FileInputStream(
							"D:\\Web\\workspace_web\\Design_Pattern\\src\\Decorator\\test.txt")));
			while((c = in.read()) > 0){
				System.out.print((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
