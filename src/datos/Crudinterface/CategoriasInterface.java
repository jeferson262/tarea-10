/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package datos.Crudinterface;

import java.util.List;

public interface CategoriasInterface<T> {

//C = crear
    //GIT o GITHUB = control de versiones que te permite ver tus codigos de mas antes
    //REPOSITORIO = almacenar tus proyectos en las nubes
    public List<T> Listar(String texto);

    public boolean insertar(T obj);

    public boolean actualizar(T obj);

    public boolean desactivar(int id);

    public boolean activar(int id);

    public int total();

    public boolean existe(String texto);

}
