
package dom;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class DOM {

    public static void main(String[] args) throws TransformerConfigurationException, TransformerException  {
        
        try {
            DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=factory.newDocumentBuilder();
            Document doc=builder.newDocument();
            
            //crea mos la raiz: universidad
            Element root=doc.createElement("universidad");
            doc.appendChild(root);
            
            //creamos elementos hijos de universidad , departamento
            //Primer departamento
            Element departamento1=doc.createElement("departamento");
            root.appendChild(departamento1);
                //añadimos un atrivuto
                Attr tipo1=doc.createAttribute("tipo");
                tipo1.setValue("A");
                Attr tlf1=doc.createAttribute("telefono");
                tlf1.setValue("112233");
                departamento1.setAttributeNode(tipo1);
                departamento1.setAttributeNode(tlf1);
            //Segundo departamento
            Element departamento2=doc.createElement("departamento");
            root.appendChild(departamento2);
                //añadimos un atrivuto
                Attr tipo2=doc.createAttribute("tipo");
                tipo2.setValue("A");
                Attr tlf2=doc.createAttribute("telefono");
                tlf2.setValue("990033");
                departamento2.setAttributeNode(tipo2);
                departamento2.setAttributeNode(tlf2);
            //tercer departamento
            Element departamento3=doc.createElement("departamento");
            root.appendChild(departamento3);
                //añadimos un atrivuto
                Attr tipo3=doc.createAttribute("tipo");
                tipo3.setValue("B");
                Attr tlf3=doc.createAttribute("telefono");
                tlf3.setValue("880833");
                departamento3.setAttributeNode(tipo3);
                departamento3.setAttributeNode(tlf3);
            
                
            //Creamos elementos hijos de departamento1
                //codigo
            Element codigo1=doc.createElement("codigo");
            codigo1.setTextContent("IFC1");
            departamento1.appendChild(codigo1);
                //nombre
            Element nombre1=doc.createElement("nombre");
            nombre1.setTextContent("Informática");
            departamento1.appendChild(nombre1);
                //empleado1
            Element empleado1D1=doc.createElement("empleado");
            Attr salario1D1=doc.createAttribute("salario");
            salario1D1.setNodeValue("2000");
            empleado1D1.setAttributeNode(salario1D1);
            departamento1.appendChild(empleado1D1);
                    //elementos hijos de empleado
                Element puesto1d1=doc.createElement("puesto");
                puesto1d1.setTextContent("Asociado");
                empleado1D1.appendChild(puesto1d1);
                
                Element nombre1d1=doc.createElement("nombre");
                nombre1d1.setTextContent("Juan Parra");
                empleado1D1.appendChild(nombre1d1);
                //empleado2
            Element empleado2D1=doc.createElement("empleado");
            Attr salario2D1=doc.createAttribute("salario");
            salario2D1.setNodeValue("2300");
            empleado2D1.setAttributeNode(salario2D1);
            departamento1.appendChild(empleado2D1);
                         //Empleado2
                Element puesto2d1=doc.createElement("puesto");
                puesto2d1.setTextContent("Profesor");
                empleado2D1.appendChild(puesto2d1);
                
                Element nombre2d1=doc.createElement("nombre");
                nombre2d1.setTextContent("Alicia Martín");
                empleado2D1.appendChild(nombre2d1);
            
               
            //Creamos elementos hijos de departamento2
                //codigo
            Element codigo2=doc.createElement("codigo");
            codigo2.setTextContent("MAT1");
            departamento2.appendChild(codigo2);
                //nombre
            Element nombre2=doc.createElement("nombre");
            nombre2.setTextContent("Matemáticas");
            departamento2.appendChild(nombre2);
                //empleado1
            Element empleado1D2=doc.createElement("empleado");
            Attr salario1D2=doc.createAttribute("salario");
            salario1D2.setNodeValue("1900");
            empleado1D2.setAttributeNode(salario1D2);
            departamento2.appendChild(empleado1D2);
                    //elementos hijos de empleado1
                Element puesto1d2=doc.createElement("puesto");
                puesto1d2.setTextContent("Técnico");
                empleado1D2.appendChild(puesto1d2);
                
                Element nombre1d2=doc.createElement("nombre");
                nombre1d2.setTextContent("Juan Parra");
                empleado1D2.appendChild(nombre1d2);
                //empleado2
            Element empleado2D2=doc.createElement("empleado");
            Attr salario2D2=doc.createAttribute("salario");
            salario2D2.setNodeValue("2100");
            empleado2D2.setAttributeNode(salario2D2);
            departamento2.appendChild(empleado2D2);
                         //elementos hijos de empleado2
                Element puesto2d2=doc.createElement("puesto");
                puesto2d2.setTextContent("Profesor");
                empleado2D2.appendChild(puesto2d2);
                
                Element nombre2d2=doc.createElement("nombre");
                nombre2d2.setTextContent("Mª Jesús Ramos");
                empleado2D2.appendChild(nombre2d2);
                
                //empleado3
            Element empleado3D2=doc.createElement("empleado");
            Attr salario3D2=doc.createAttribute("salario");
            salario3D2.setNodeValue("2300");
            empleado3D2.setAttributeNode(salario3D2);
            departamento2.appendChild(empleado3D2);
                         //elementos hijos de empleado3
                Element puesto3d2=doc.createElement("puesto");
                puesto3d2.setTextContent("Profesor");
                empleado3D2.appendChild(puesto3d2);
                
                Element nombre3d2=doc.createElement("nombre");
                nombre3d2.setTextContent("Pedro Paniagua");
                empleado3D2.appendChild(nombre3d2);
                
                //empleado2
            Element empleado4D2=doc.createElement("empleado");
            Attr salario4D2=doc.createAttribute("salario");
            salario4D2.setNodeValue("2500");
            empleado4D2.setAttributeNode(salario4D2);
            departamento2.appendChild(empleado4D2);
                         //elementos hijos de empleado2
                Element puesto4d2=doc.createElement("puesto");
                puesto4d2.setTextContent("Tutor");
                empleado4D2.appendChild(puesto4d2);
                
                Element nombre4d2=doc.createElement("nombre");
                nombre4d2.setTextContent("Antonia González");
                empleado4D2.appendChild(nombre4d2);
                

                
             //Creamos elementos hijos de departamento3
                //codigo
            Element codigo3=doc.createElement("codigo");
            codigo3.setTextContent("MAT2");
            departamento3.appendChild(codigo3);
                //nombre
            Element nombre3=doc.createElement("nombre");
            nombre3.setTextContent("Análisis");
            departamento3.appendChild(nombre3);
                //empleado1
            Element empleado1D3=doc.createElement("empleado");
            Attr salario1D3=doc.createAttribute("salario");
            salario1D3.setNodeValue("1900");
            empleado1D3.setAttributeNode(salario1D3);
            departamento3.appendChild(empleado1D3);
                    //elementos hijos de empleado
                Element puesto1d3=doc.createElement("puesto");
                puesto1d3.setTextContent("Asociado");
                empleado1D3.appendChild(puesto1d3);
                
                Element nombre1d3=doc.createElement("nombre");
                nombre1d3.setTextContent("Laura Ruiz");
                empleado1D3.appendChild(nombre1d3);
                //empleado2
            Element empleado2D3=doc.createElement("empleado");
            Attr salario2D3=doc.createAttribute("salario");
            salario2D3.setNodeValue("2200");
            empleado2D3.setAttributeNode(salario2D3);
            departamento3.appendChild(empleado2D3);
                         //Empleado2
                Element puesto2d3=doc.createElement("puesto");
                puesto2d3.setTextContent("Asociado");
                empleado2D3.appendChild(puesto2d3);
                
                Element nombre2d3=doc.createElement("nombre");
                nombre2d3.setTextContent("Mario García");
                empleado2D3.appendChild(nombre2d3);
                
                
                
                
            
           //Pasarlo a un xml file
            /*TransformerFactory transformerFactory=TransformerFactory.newInstance();
            Transformer transformer=transformerFactory.newTransformer();
            DOMSource source=new DOMSource(doc);
            StreamResult result=new StreamResult(new File("C:\\Users\\alfon\\Documents\\NetBeansProjects\\alumnos.xml"));
            transformer.transform(source, result);*/
            
            
            //Mostrar por consola
            Source source = new DOMSource (doc);// crea fuente de entrada con nodo DOM
            Result result = new StreamResult (new java.io.File("empleado.xml"));// Genero fichero donde volcar� el contenido del xml
            Transformer transformer= TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);// tansforma empleado.xml a result
            Result console = new StreamResult(System.out);
            transformer.transform(source, console);
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(DOM.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
