
package com.pos.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ManterCarroService", targetNamespace = "http://services.pos.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ManterCarroService {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "cadastrarCarro", targetNamespace = "http://services.pos.com/", className = "com.pos.services.CadastrarCarro")
    @ResponseWrapper(localName = "cadastrarCarroResponse", targetNamespace = "http://services.pos.com/", className = "com.pos.services.CadastrarCarroResponse")
    @Action(input = "http://services.pos.com/ManterCarroService/cadastrarCarroRequest", output = "http://services.pos.com/ManterCarroService/cadastrarCarroResponse")
    public void cadastrarCarro(
        @WebParam(name = "arg0", targetNamespace = "")
        Carro arg0);

    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "onConstruct", targetNamespace = "http://services.pos.com/", className = "com.pos.services.OnConstruct")
    @ResponseWrapper(localName = "onConstructResponse", targetNamespace = "http://services.pos.com/", className = "com.pos.services.OnConstructResponse")
    @Action(input = "http://services.pos.com/ManterCarroService/onConstructRequest", output = "http://services.pos.com/ManterCarroService/onConstructResponse")
    public void onConstruct();

    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "onDestroy", targetNamespace = "http://services.pos.com/", className = "com.pos.services.OnDestroy")
    @ResponseWrapper(localName = "onDestroyResponse", targetNamespace = "http://services.pos.com/", className = "com.pos.services.OnDestroyResponse")
    @Action(input = "http://services.pos.com/ManterCarroService/onDestroyRequest", output = "http://services.pos.com/ManterCarroService/onDestroyResponse")
    public void onDestroy();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "excluirCarro", targetNamespace = "http://services.pos.com/", className = "com.pos.services.ExcluirReserva")
    @ResponseWrapper(localName = "excluirCarroResponse", targetNamespace = "http://services.pos.com/", className = "com.pos.services.ExcluirReservaResponse")
    @Action(input = "http://services.pos.com/ManterCarroService/excluirCarroRequest", output = "http://services.pos.com/ManterCarroService/excluirCarroResponse")
    public void excluirCarro(
        @WebParam(name = "arg0", targetNamespace = "")
        Reserva arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "atualizaCarro", targetNamespace = "http://services.pos.com/", className = "com.pos.services.AtualizarReserva")
    @ResponseWrapper(localName = "atualizaCarroResponse", targetNamespace = "http://services.pos.com/", className = "com.pos.services.AtualizarReservaResponse")
    @Action(input = "http://services.pos.com/ManterCarroService/atualizaCarroRequest", output = "http://services.pos.com/ManterCarroService/atualizaCarroResponse")
    public void atualizaCarro(
        @WebParam(name = "arg0", targetNamespace = "")
        Reserva arg0);

}
