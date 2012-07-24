// Copyright 2012 Jeeeyul Lee, Seoul, Korea
// https://github.com/jeeeyul/pde-tools
//
// This module is multi-licensed and may be used under the terms
// of any of the following licenses:
//
// EPL, Eclipse Public License, V1.0 or later, http://www.eclipse.org/legal
// LGPL, GNU Lesser General Public License, V2.1 or later, http://www.gnu.org/licenses/lgpl.html
// GPL, GNU General Public License, V2 or later, http://www.gnu.org/licenses/gpl.html
// AL, Apache License, V2.0 or later, http://www.apache.org/licenses
// BSD, BSD License, http://www.opensource.org/licenses/bsd-license.php
// MIT, MIT License, http://www.opensource.org/licenses/MIT
//
// Please contact the author if you need another license.
// This module is provided "as is", without warranties of any kind.
package net.jeeeyul.pdetools.shared;

import java.net.URL;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

/*
 * Generated by PDE Tools.
 */
public class SharedImages{
	/**
	 * Constants set for folder 'icons/frames'
	 */
	public static interface FRAMES{
		/**
		 * <img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAIgAAAB6CAYAAABk4BtAAAAABGdBTUEAALGPC/xhBQAAAAlwSFlzAAAOwgAADsIBFShKgAAAAEd0RVh0U291cmNlAFNob3R0eSB2Mi4wLjIuMjE2IChDKSBUaG9tYXMgQmF1bWFubiAtIGh0dHA6Ly9zaG90dHkuZGV2cy1vbi5uZXQshBXVAAAAGnRFWHRTb2Z0d2FyZQBQYWludC5ORVQgdjMuNS4xMDD0cqEAAAbHSURBVHhe7dxLTxtXGAZg/4gqQio/oD+AfSVaKVIWVVVV3WTRTTfddNNVF1110VWFlE2bXpWqt7RV1AtpQkhIKLm1SbgYczMQbuZisMEYgylx8vV8A2cYf+dAh3oWcM6L9MomGVv4vM98M7YxKSJKRdPS0kKIf2vQ3NxMTU1NikK9hxAHo2htbaWOjg6am5vjDfHl0QrUajUazxfo+ZfO0HOnToVQAiCMo62tjXK5HH3S3o94vAbpUpUuDk+HSAIgPDkYx/n2AQRrQN2rm9T8+tlgigTTgw8r5y8rHAjWYM/ApXwlOCcJgPA5x6d/pBGsQWjgx7yaIurENQBSrVbpsyuDCNYgNPDdYiV4NhsA4a8vrmYQrEFo4MKCAPJlR4YQrIE28Pm8APLVtWFCsAbawMe5zfpDzIXOEUKwBtrAuVkxQYADOKIGDCBfXx8lBGugDXw0IybIN11jhGANtIEPpwWQb29mCcEaaAMfPBZAvr81QQjWQBt4f1IA+aF7khCsgTbw3oQAcrFnkhCsgTbw7vhG/esgP92eIgRroA28kxVAfr4zTQjWQBt4e0wAuXRvhhCsgTbw1ogA8sv9WUKwBtrAm0MCyK9/5QjBGmgDZyWQ3x7ME4I10AbeyJTrn8X8/nCBEKyBNvDaoADS/miBEKyBNvBKWgC53LtICNZAGzgzIE5Sr/QtEYI10AZO94sJcrU/TwjWQBt4uU8A6RhYJgRroA20aiCpFH/6kg7E8ewZEeLuGhw0FF7sLavPXaY4hwN5yjpePY04uAbcbcNAajUAcXUH4W4bBrLz5Cmmh4PTg9Fztw0D2d6pAYijQLjbhoFUtwHE1UMMd9swkM3qE0wQRycId9swkI3NHQBxFAh32zCQcgVAXD3EcLcNAymW/sEEcXSCLBW2AMTVvT+JxwUgju75SeDg+wAQADn09ABAAARAkhq3Pt4PJggmCCaIj3t+Uo8ZEwQTBBMkqb3Jx/vBBMEEwQTxcc9P6jEfaYJcU7/VLsNv5OC9GHd/H1cDsXVv/NIygLgL4aCJczQgaTVBRHiC5NU7fkmNNNzP8ULI3XLHsnf+3pwgAOLdjpAMkCImiKuTL6+6bXiCLBer3u1ZroKQj4u7jQ2kUx1iZPjGy6sA4ioY7pY7tnVvnIN0plfUhvXhG68AiLMTlLvdB1LffWwghbVtZxfI1ckQ93Fxt7tAzOFgALk+uELRdKrv+caFEoDEXfCTth13yx3L7vn7/wTCG+GV1OP1ukXSAPlV8oaBrK7jYw9JF3Nc7o+7jQ3khpoYMnxjAHF3imggtu6NQ8yNjAIiwkDWyvhk3XHZ45P+OfQhxtZ9bCAlAHH2WdyRgHSp6SHDEwRA3D3EaCC27o0J0pUpKCD1wbMYd3Hw4WofiNm9AeTmUIE4XZEEE6RUcnbEJn1MP2n3p4Ho3rUBvjwQSHQjTBA/Jki0c33dAHJLqZEBED+A2Lo3gQwrICIA4gkQS/cGkG61kQyA+AHE1r0B5M+RIskAiB9AbN0DCD5UFT7NjQWkR00QGUwQPyaIrXtjgvSMKiAiAOIJEEv3BpDbaiMZAPEDiK17A8idsSLJAIgfQGzdW4CsKiD1ARBfgJjdG0DuKhwyAOIHEFv3BpB72VWSARA/gNi6BxC8DhK+DhILyP3xNZLBBPFjgti6NybI3xNrJAMgfgCxdW8AeTC5RjIA4gcQW/cWICUFpD4A4gsQs3sDyMPHJZIBED+A2Lo3gDxSQGQAxA8gtu4NIL1TJZIBED+A2Lo3gPRNrZMMgPgBxNa9AaR/ep1kAMQPILbuAQSvpFK1uvsXhmIBGZhZJxlMELcniAZi696YIGkFRAZA/ABi694AMjhbJhkGsrWFv5N60j5SGffn5W65Y1v3BpDMXJlkAMTtCaKB2Lo3gAzlyiQDIH4A0b0P5zZCAwYQ/k8ZnIO4DUR/ut/WvQFkRAEJMr93qa4DiB9Awu61AXVpAmEYIgDiCRBL9waQUbWRDID4AcTWvQFkbGGDOKORAIgfQKLd6+sWIBUFpD4A4gsQs3sDSHaxQlkFJBoA8QNI0Lno3w6EN4oEQDwBInpnAwaQcfWPMgDiBxBb9wCCt/vDD07FAjKxVCEZTBA/Joite2OCAIjbGGzv8OqX2mMC2VQThMOTZPc6JojbaPaB6O73L3EOgnOQo52D4N1ct6fFYYeYWO/m3lV/HyQa/pMA+hDDowhxcw24Y1v3xiGGN0SwBtrAC305SqVSnBTxF3AAR9QAgGBiHjoUAARAAASHzf9/2MQEwQSJP0FYC4I1kAbCZzF7V/TTGlzuPr1D1Br8C3wCw+uCpxlGAAAAAElFTkSuQmCC">
		 * Image constant for icons/frames/win7-basic.png
		 */
		public static final String WIN7_BASIC = "icons/frames/win7-basic.png";
	}
	
	/**
	 * <img src="data:image/gif;base64,R0lGODlhEAAQANUAADV2VDh6Vzh5Vzt+Wjx+WkCFXkSLYkWMY0WLYkWLY0WMYkqTZ0qTaE+abFCabFShcVWhcVShcFindVWicVyseV+we12seY20U420VJa5VZa5VqDAWKHAWKzHWqzHW63HWq3GWq3HW8XWYMbWYMXVYMbVYMXVYdDbY9riZdrhZeDlZv///wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACH5BAEAACsALAAAAAAQABAAAAZbwJVwSCwaj0hhZVlJDisqVdO5oqRQFupKcpUgJxHI40Q+Pc4PokMkMpHapRG7QWSEQqAOKOT5+BdEBgkKChscGxsKCAcHSAUZGgVaBBgXA1oBlQJaAJ0AWqCgQQA7">
	 * Image constant for icons/add.gif
	 */
	public static final String ADD = "icons/add.gif";
	
	/**
	 * <img src="data:image/gif;base64,R0lGODlhEAAQAOYAAAAAAP///zNmmWaZzJnM/1tsfXKDlO7u7uzs7Ovr6+np6efn5+bm5uPj49/f397e3t3d3dvb29fX19TU1NHR0c7OzszMzMvLy8jIyMbGxsPDw8LCwsHBwby8vLW1tbCwsK+vr66urqqqqqioqKampqSkpKOjo6GhoaCgoJycnJmZmZiYmJaWlpOTk5KSkpGRkY6OjoyMjIqKiomJiYeHh4aGhoWFhYCAgH19fXl5eXd3d3V1dWxsbGZmZmJiYlxcXFpaWlRUVFNTU01NTUZGRkVFRT09PTc3NzMzM////wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACH5BAEAAEkALAAAAAAQABAAAAfQgEmCg0kihiKEiYIvIwcHIy+JhyI6OhaXFpWDIxeOFyOgoaJJJQimp6inGCU9rT0qFhsehh4blwonPio+OBYdHxOOEx8dSAwpPy0/KBwjDgnQCQ4jHA0rQTJBGh8ZCzZISDYLGR8OLUM3QxEpDzQ4AQQFNA8pETBFO0USLxBEAv8CiEB4IWGGER5GJsSYIGSAwwFCFE6wcaTHEQoxQLQwQICAgRYgYlC4QQQJkAouamxg0YrFhhouSODIYeLSjBw2QlwKYSOHT0GVNCUJqiNRIAA7">
	 * Image constant for icons/camera.gif
	 */
	public static final String CAMERA = "icons/camera.gif";
	
	/**
	 * <img src="data:image/gif;base64,R0lGODlhEAAQAPcAAAAAAF9zll52o2Bzlm2ErXGCoK2BUq+EVrGJXLONY7WQZ7yWar6Ya8OaZMWaYcGbbMSeb8eicsqldMyodc6pds6sediubNCseNOuetSwe9q9fPHFcfHGcfHIeYKRqoeUrYeUroyYqoCUtIGXvI6bsJKbppKcppqfoZmgoaGknKiol6+tkrCskrawjru0ipGlx5enwJinwK66zKvB1NTBr+DIj/LMg/LQjvPUmvTUmfTYpfTdsPXhut7o997o+OTWxvbjwvXkwvbmyOLr9+Hq+OXt+Orw+e7y+e/z+vP1+vL1+/L2+vP2+/b3+vX4+vj5+wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACH5BAEAAP8ALAAAAAAQABAAAAi7AP8JFEhixgwSAxMm9CCjoQwPCgX+cOCgQAwYMGIUMODgR8IMQgaIGEkygJAKH4WoXMlyQkIMQYAECeKips0GCS/w2MnDxZOfTzS0SEhhh9EdLZy8ENCkhtCBEnRI1cGCiZIlWJOsGBgBB44cOVQgeTGCgIAjKgZCuMH2RgojcOOmGPjAhl0bKIqQNVvkxEAGHQJ3MEFkCJHDREoMXGBhAwcOIXz0kNyjR4iBNBQkQHAABIgPoENHHK0wIAA7">
	 * Image constant for icons/clipboard.gif
	 */
	public static final String CLIPBOARD = "icons/clipboard.gif";
	
	/**
	 * <img src="data:image/gif;base64,R0lGODlhEAAQAOYAAC0rTzpIZzZGZT9ObAAocgAocTBDZDJEZTdHZTtLZzxLZzBGajFHajJIazJHajVKbDNGZDRGZThObrK7x7jD0CVvviZvvihxvyVwvip0wip0wStzvi10vi51vy92v1BsiFJuij51pkJ4qDRwpDRwozVxpUB3pwdYmApamT2GvDyGuz6Hu0KJvESMvUWNvVKZwPf8/06Yv0+Yv1OawPb8//X8//f9//X9//n+//3//6LEv6TFwKTDvqXHwdPp5dHn49Lp5NHo46jIwMrpv8ztv8vsv8vpv8/xweru5+nt5fj/vf//xv//1f//28PBlsnEmMXBl+3s4vb05ff15+nkz+Xgzenjz/Tw4/Lu4+nhz////////wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACH5BAEAAFsALAAAAAAQABAAAAeAgFuCg4SFhoeGABRIQSosK1iIFBIPT0ACVRYvQ4ZID00NWqJFATGGP08NTAtOWgY6GFGFKT5aDEsMNqJWG4UsCFpQDkoFWhAKLoUrPDA0SQQTODlCHoVRFUQHWjQ1ET0aUoYyATvGN0cDH4dGMxdZCVQZIIiCVxwtHVP0+/z9/YEAOw==">
	 * Image constant for icons/configure.gif
	 */
	public static final String CONFIGURE = "icons/configure.gif";
	
	/**
	 * <img src="data:image/gif;base64,R0lGODlhEAAQAPcAAAAAAGBgYGhoaHBwcHh4eICAgIiIgIiIiJCQiJCQkJiYmKCgoKiooKioqLCwsNjY2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACH5BAEAAP8ALAAAAAAQABAAAAikAP8hYPCvYEEGCAwaRJBgoEGEDRUKfPCAoYOGFBE4UMjAAEUFBhRQNEBQYoICFFMWSCDRYAEEDwgoQFDAoAICBhMQiFlAJgGWN3v+0/mgAYEFCwgUaNATKc6dMRUMUKDgwIADVKf+I2Dg578CAhKIFSugZkGvBQUQOMCWgICWBQsEKECX7tyWcukOCDDArtmCDebmZSo4gES+d+MibpnYpeF/AQEAOw==">
	 * Image constant for icons/delete-all.gif
	 */
	public static final String DELETE_ALL = "icons/delete-all.gif";
	
	/**
	 * <img src="data:image/gif;base64,R0lGODlhEAAQAPcAAAAAADAxKDk8NUZJPlRSQldZU11hXWxVQ3JcS3djUnhjU31qW31rXHp5ZH9+cI9SGZ5fHZ5mJ6VsJK1sJK1yK61yL7R/Mrx/MoNxY4NyZIh4a4l5bIB+cIx8cI1+c7yFMo+BdZGDeJSGfJaJf5WRf8OFNsOLNvjQeJiLgZqOhKyojbq1nL25ob66pcjAp9XOtdjOtOjQiPjQgPjYiPDYkPjYkPjgmPjomPjgoPjosNjVweTZwuvfyfjwyP///wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACH5BAEAAP8ALAAAAAAQABAAAAiZAP8JHEiwoMGDCP+lQDFCRAgQHjpsKGjChAgfGDP6yEBwAkYPPgYQCCDAgA8GA0vcuEFDg48GK0hwKOBDwcAPPXJi8KGCxYsWDnwgGHghh9EFPlzA2MFDh48DAy3gmJqggtWrWP9RqMG1go2vYL/GqPBPwowZFc6qVTtWIIQTFWTInSu3rcAHFU7o3avX7sAIgAMLTki4sMGAADs=">
	 * Image constant for icons/image-folder.gif
	 */
	public static final String IMAGE_FOLDER = "icons/image-folder.gif";
	
	/**
	 * <img src="data:image/gif;base64,R0lGODlhCQAJAPcAADAxKDk8NUZJPltAKl1CLV9FMWBHMmFIM2NKNmVMOWZOO2hQPGlSP1RSQldZU11hXWtUQmxVQ3FbSnJcS3djUnhjU31qW31rXHp5ZH9+cINxY4NyZIh4a4l5bIB+cIx8cI1+c4+BdZGDeJSGfJaJf5WRf5iLgZqOhKGliKyojbq1nL25ob66pbrBsNO9qcjAp9XOtdjOtN7NuNjVweTZwuvfyevgyf///wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACwAAAAACQAJAAAIVQBPmCAxQkQIEB86jLjBsOGNDSBuCGgAIMCDGxc43MCgooQHBzcqaLiRYgUMFhluTLBw40UMGjVm3IhA4QYKFzJstLihQILDhgYgMFiQAMGBAgQGBAQAOw==">
	 * Image constant for icons/image.gif
	 */
	public static final String IMAGE = "icons/image.gif";
	
	/**
	 * <img src="data:image/gif;base64,R0lGODlhTgBOAPcAAAAAAKZrEKhuEKhuEa1yEaxyErF4E7Z8FLZ9FbqBFbqBFr2EFsOWHcKZIPnNX/jQYPHTc/jYePndevDYgPHag/jYgPvehfjgiPnolPjomPvpnvDgqPjwsPvwtPj46P797wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACH5BAEAAP8ALAAAAABOAE4AAAjdAP8JHEiwoMGDCBMqXMiwocOHECNKnEixosWLGDNq3Mixo8ePIEOKHEmypMmTKFOqXMmypcuXMGPKnEmzps2bOHPq3Mmzp8+fQIMKHUq0qFGaCxYcJbjgg9Kl/xJ8+JBAgYKjBzB02NqBAgKjBiRoGDsWQgOjBRxYKJB27dEBDgb8gysg6NOkAgMEyGvX6b8FHp4WBcwhqYcNgocuuMChceMJDIweiJChcoYIB46yLVDhAQGo/wI82AtaL+jTqFOrXs26tevXsGPLnk27tu3buHPr3s27t+/fwIMfDAgAOw==">
	 * Image constant for icons/refresh.gif
	 */
	public static final String REFRESH = "icons/refresh.gif";
	private static final ImageRegistry REGISTRY = new ImageRegistry(Display.getDefault());
	
	public static Image getImage(String key){
		Image result = REGISTRY.get(key);
		if(result == null){
			result = loadImage(key);
			REGISTRY.put(key, result);
		}
		return result;
	}
	
	public static ImageDescriptor getImageDescriptor(String key){
		ImageDescriptor result = REGISTRY.getDescriptor(key);
		if(result == null){
			result = loadImageDescriptor(key);
			REGISTRY.put(key, result);
		}
		return result;
	}
	
	private static Image loadImage(String key) {
		try {
			URL resource = Platform.getBundle("net.jeeeyul.pdetools").getResource(key);
			Image image = new Image(null, resource.openStream());
			return image;
		} catch (Exception e) {
			e.printStackTrace();
			return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJS_ERROR_TSK);
		}
	}
	
	private static ImageDescriptor loadImageDescriptor(String key) {
		try {
			URL resource = Platform.getBundle("net.jeeeyul.pdetools").getResource(key);
			ImageDescriptor descriptor = ImageDescriptor.createFromURL(resource);
			return descriptor;
		} catch (Exception e) {
			e.printStackTrace();
			return PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_OBJS_ERROR_TSK);
		}
	}
}
