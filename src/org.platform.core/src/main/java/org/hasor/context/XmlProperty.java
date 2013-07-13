/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hasor.context;
import java.util.List;
import java.util.Map;
/**
 * Xml���Խڵ㡣
 * @version : 2013-4-22
 * @author ������ (zyc@byshell.org)
 */
public interface XmlProperty {
    /**��ȡXml�ڵ�Ԫ�����ơ�*/
    public String getName();
    /**��ȡXml�ڵ��ı�ֵ��*/
    public String getText();
    /**��ȡXml�ڵ�Xml�ı�ֵ��*/
    public String getXmlText();
    /**��ȡ���Լ���*/
    public Map<String, String> getAttributeMap();
    /**��ȡXml�ӽڵ㡣*/
    public List<XmlProperty> getChildren();
    /**��ȡ���ڵ�*/
    public XmlProperty getParent();
    /**��¡һ��XmlProperty*/
    public XmlProperty clone() throws CloneNotSupportedException;
}