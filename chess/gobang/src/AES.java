import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
  
import javax.crypto.BadPaddingException;  
import javax.crypto.Cipher;  
import javax.crypto.IllegalBlockSizeException;  
import javax.crypto.KeyGenerator;  
import javax.crypto.NoSuchPaddingException;  
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class AES
{  
	private static String key= "7648951352416850";
	
	public static String encrypt(String content, String key)
	{
		try
		{
			KeyGenerator kgen = KeyGenerator.getInstance("AES");		//�c�y���_�ͦ����A���w��AES�t��k�A���Ϥ��j�p�g
			kgen.init(128, new SecureRandom(key.getBytes()));
			SecretKey secretKey = kgen.generateKey();
			byte[] enCodeFormat = secretKey.getEncoded();
			SecretKeySpec secretKeySpec = new SecretKeySpec(enCodeFormat, "AES");
			Cipher cipher = Cipher.getInstance("AES");
			byte[] byteContent = content.getBytes("utf-8");
			cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);		//ENCRYPT_MODE���[�K�ާ@
			byte[] byteResult = cipher.doFinal(byteContent);
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < byteResult.length; i++)
			{
				String hex = Integer.toHexString(byteResult[i] & 0xFF);
				if (hex.length() == 1)
				{
					hex = '0' + hex;
				}
				sb.append(hex.toUpperCase());
			}
			return sb.toString();
		}
		catch (NoSuchAlgorithmException e)
		{
			e.printStackTrace();
		}
		catch (NoSuchPaddingException e)
		{
			e.printStackTrace();
		}
		catch (InvalidKeyException e)
		{
			e.printStackTrace();
		}
		catch (UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}
		catch (IllegalBlockSizeException e)
		{
			e.printStackTrace();
		}
		catch (BadPaddingException e)
		{
			e.printStackTrace();
		}
		
		return null;
	}	
	
	public static String decrypt(String content, String key)
	{
		if (content.length() < 1)
		{
			return null;
		}
		
		byte[] byteResult = new byte[content.length() / 2];
		for (int i = 0; i < content.length() / 2; i++)
		{
			int high = Integer.parseInt(content.substring(i * 2, i * 2 + 1), 16);
			int low = Integer.parseInt(content.substring(i * 2 + 1, i * 2 + 2),16);
			byteResult[i] = (byte) (high * 16 + low);
		}
		
		try
		{
			KeyGenerator kgen = KeyGenerator.getInstance("AES");
		    SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");  
		    secureRandom.setSeed(key.getBytes()); 
			kgen.init(128, secureRandom);
			SecretKey secretKey = kgen.generateKey();
			byte[] enCodeFormat = secretKey.getEncoded();
			SecretKeySpec secretKeySpec = new SecretKeySpec(enCodeFormat, "AES");
			Cipher cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);		//DECRYPT_MODE���ѱK�ާ@
			byte[] result = cipher.doFinal(byteResult);
			
			return new String(result,"utf-8");		//���[utf-8�A����ɷ|�ýX
		}
		catch (NoSuchAlgorithmException e)
		{
			e.printStackTrace();
		}
		catch (NoSuchPaddingException e)
		{
			e.printStackTrace();
		}
		catch (InvalidKeyException e)
		{
			e.printStackTrace();
		}
		catch (IllegalBlockSizeException e)
		{
			e.printStackTrace();
		}
		catch (BadPaddingException e)
		{
			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static String decrypt(String content)
	{
		return decrypt(content, key);
	}
	public static String encrypt(String content)
	{
		return encrypt(content, key);
	}
}  