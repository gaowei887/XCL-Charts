/**
 * Copyright 2014  XCL-Charts
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 	
 * @Project XCL-Charts 
 * @Description Android图表基类库
 * @author XiongChuanLiang<br/>(xcl_168@aliyun.com)
 * @license http://www.apache.org/licenses/  Apache v2 License
 * @version 1.8
 */
package org.xclcharts.renderer.plot;

import org.xclcharts.renderer.XEnum;

import android.graphics.Color;
import android.graphics.Paint;

/**
 * @ClassName LabelBrokenLine
 * @Description 绘制折线标签的基类
 * @author XiongChuanLiang<br/>(xcl_168@aliyun.com)
 *  
 */
public class LabelBrokenLine {
	
	private XEnum.LabelLinePoint mLinePoint = XEnum.LabelLinePoint.ALL;
	private float mRadius = 5.f;
	
	//当标签为Line类型时使用
	private Paint mPaintLabelLine = null;
	
	//画点 
	private Paint mPaintPoint = null;
		
	//标签与点的转折线长度
	private float mLabelBrokenLineLength = 20.f;
		
	
	public LabelBrokenLine()
	{		
	}

	/**
	 * 设置在线上点的风格
	 * @param style 风格
	 */
	public void setLinePointStyle(XEnum.LabelLinePoint style)
	{
		mLinePoint = style;
	}
	
	/**
	 * 返回当前线上点的风格
	 * @return 风格
	 */
	public XEnum.LabelLinePoint getLinePointStyle()
	{
		return mLinePoint;
	}
	
	/**
	 * 设置点的半径
	 * @param radius	半径
	 */
	public void setRadius(float radius)
	{
		mRadius = radius;
	}
	
	/**
	 * 返回点的半径
	 * @return
	 */
	public float getRadius()
	{
		return mRadius;
	}
	
	/**
	 * 设置折线长度
	 * @param len	长度
	 */
	public void setBrokenLine(float len)
	{
		mLabelBrokenLineLength = len;
	}
	
	/**
	 * 返回折线长度
	 * @return	长度
	 */
	public float getBrokenLine()
	{
		return mLabelBrokenLineLength;
	}
	
	
	/**
	 * 开放标签线画笔(当标签为Line类型时有效)
	 * @return 画笔
	 */
	public Paint getLabelLinePaint()
	{
		if(null == mPaintLabelLine)
		{
			mPaintLabelLine = new Paint(Paint.ANTI_ALIAS_FLAG);
			mPaintLabelLine.setColor(Color.BLACK);		
			mPaintLabelLine.setStrokeWidth(2);
		}
		return mPaintLabelLine;
	}
	
	/**
	 * 返回折线点画笔
	 * @return	画笔
	 */
	public Paint getPointPaint()
	{
		if(null == mPaintPoint)
		{
			mPaintPoint = new Paint(Paint.ANTI_ALIAS_FLAG);
		}
		return mPaintPoint;
	}
	
	
}
