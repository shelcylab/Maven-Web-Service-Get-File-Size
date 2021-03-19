
package com.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetFileSize_QNAME = new QName("http://services.com/", "getFileSize");
    private final static QName _WaitFor10Secs_QNAME = new QName("http://services.com/", "WaitFor10Secs");
    private final static QName _GetFileSizeResponse_QNAME = new QName("http://services.com/", "getFileSizeResponse");
    private final static QName _WaitFor10SecsResponse_QNAME = new QName("http://services.com/", "WaitFor10SecsResponse");
    private final static QName _GetFileNameResponse_QNAME = new QName("http://services.com/", "getFileNameResponse");
    private final static QName _Exception_QNAME = new QName("http://services.com/", "Exception");
    private final static QName _GetFileName_QNAME = new QName("http://services.com/", "getFileName");
    private final static QName _GetFileNameArg1_QNAME = new QName("", "arg1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFileSize }
     * 
     */
    public GetFileSize createGetFileSize() {
        return new GetFileSize();
    }

    /**
     * Create an instance of {@link WaitFor10Secs }
     * 
     */
    public WaitFor10Secs createWaitFor10Secs() {
        return new WaitFor10Secs();
    }

    /**
     * Create an instance of {@link GetFileNameResponse }
     * 
     */
    public GetFileNameResponse createGetFileNameResponse() {
        return new GetFileNameResponse();
    }

    /**
     * Create an instance of {@link WaitFor10SecsResponse }
     * 
     */
    public WaitFor10SecsResponse createWaitFor10SecsResponse() {
        return new WaitFor10SecsResponse();
    }

    /**
     * Create an instance of {@link GetFileSizeResponse }
     * 
     */
    public GetFileSizeResponse createGetFileSizeResponse() {
        return new GetFileSizeResponse();
    }

    /**
     * Create an instance of {@link GetFileName }
     * 
     */
    public GetFileName createGetFileName() {
        return new GetFileName();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFileSize }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.com/", name = "getFileSize")
    public JAXBElement<GetFileSize> createGetFileSize(GetFileSize value) {
        return new JAXBElement<GetFileSize>(_GetFileSize_QNAME, GetFileSize.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaitFor10Secs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.com/", name = "WaitFor10Secs")
    public JAXBElement<WaitFor10Secs> createWaitFor10Secs(WaitFor10Secs value) {
        return new JAXBElement<WaitFor10Secs>(_WaitFor10Secs_QNAME, WaitFor10Secs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFileSizeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.com/", name = "getFileSizeResponse")
    public JAXBElement<GetFileSizeResponse> createGetFileSizeResponse(GetFileSizeResponse value) {
        return new JAXBElement<GetFileSizeResponse>(_GetFileSizeResponse_QNAME, GetFileSizeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaitFor10SecsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.com/", name = "WaitFor10SecsResponse")
    public JAXBElement<WaitFor10SecsResponse> createWaitFor10SecsResponse(WaitFor10SecsResponse value) {
        return new JAXBElement<WaitFor10SecsResponse>(_WaitFor10SecsResponse_QNAME, WaitFor10SecsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFileNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.com/", name = "getFileNameResponse")
    public JAXBElement<GetFileNameResponse> createGetFileNameResponse(GetFileNameResponse value) {
        return new JAXBElement<GetFileNameResponse>(_GetFileNameResponse_QNAME, GetFileNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFileName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.com/", name = "getFileName")
    public JAXBElement<GetFileName> createGetFileName(GetFileName value) {
        return new JAXBElement<GetFileName>(_GetFileName_QNAME, GetFileName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "arg1", scope = GetFileName.class)
    public JAXBElement<byte[]> createGetFileNameArg1(byte[] value) {
        return new JAXBElement<byte[]>(_GetFileNameArg1_QNAME, byte[].class, GetFileName.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "arg1", scope = GetFileSize.class)
    public JAXBElement<byte[]> createGetFileSizeArg1(byte[] value) {
        return new JAXBElement<byte[]>(_GetFileNameArg1_QNAME, byte[].class, GetFileSize.class, ((byte[]) value));
    }

}
