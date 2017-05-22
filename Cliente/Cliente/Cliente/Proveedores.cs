using Newtonsoft.Json;
using Newtonsoft.Json.Linq;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Cliente
{
   

        public partial class Proveedores : Form
    {
        string cif = "";
        public Proveedores()
        {
            InitializeComponent();
        }


        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click_1(object sender, EventArgs e)
        {
            WebRequest request = WebRequest.Create("http://localhost:9090/api/" + textBox1.Text);
            request.Credentials = CredentialCache.DefaultCredentials;
            WebResponse response = request.GetResponse();
            using (var streamReader = new StreamReader(response.GetResponseStream()))
            {
                //streamReader.ReadToEnd();
                var result = streamReader.ReadToEnd();   
                textBox2.Text = result;
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            WebRequest request = WebRequest.Create("http://localhost:9090/api/eliminar?cif=" + textBox1.Text);
            request.Credentials = CredentialCache.DefaultCredentials;
            WebResponse response = request.GetResponse();
            using (var streamReader = new StreamReader(response.GetResponseStream()))
            {
                //streamReader.ReadToEnd();
                var result = streamReader.ReadToEnd();
                if (result == "1")
                {
                    textBox2.Text = "Proveedore eliminado correctamente";
                } else {
                    textBox2.Text = "No se ha podido elimar el proveedor, ha habido un error";
                   }
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            var httpWebRequest = (HttpWebRequest)WebRequest.Create("http://localhost:9090/api/crear");
            httpWebRequest.ContentType = "application/json";
            httpWebRequest.Method = "POST";

             using(var streamWriter = new StreamWriter(httpWebRequest.GetRequestStream()))
             {
                 string json = "{\"cif\":\"" + textBox3.Text + "\"," +
                              "\"nombre\":\"" + textBox4.Text + "\"," +
                              "\"direccion\":\"" + textBox5.Text + "\"," +
                              "\"telefono\":\"" + textBox6.Text + "\"," +
                               "\"Provincia\":\"" + textBox7.Text + "\"}";

                 streamWriter.Write(json);
                 streamWriter.Flush();
                 streamWriter.Close();
             }

             var httpResponse = (HttpWebResponse)httpWebRequest.GetResponse();
             using (var streamReader = new StreamReader(httpResponse.GetResponseStream()))
             {
                 var result = streamReader.ReadLine();
                textboxeditar.Text = "Insertado correctamente en la BD";
             }
        }

        private void button4_Click(object sender, EventArgs e)
        {
            var httpWebRequest = (HttpWebRequest)WebRequest.Create("http://localhost:9090/api/editar");
            httpWebRequest.ContentType = "application/json";
            httpWebRequest.Method = "POST";

            using (var streamWriter = new StreamWriter(httpWebRequest.GetRequestStream()))
            {
                string json = "{\"cif\":\"" + textBox3.Text + "\"," +
                             "\"nombre\":\"" + textBox4.Text + "\"," +
                             "\"direccion\":\"" + textBox5.Text + "\"," +
                             "\"telefono\":\"" + textBox6.Text + "\"," +
                              "\"Provincia\":\"" + textBox7.Text + "\"}";

                streamWriter.Write(json);
                streamWriter.Flush();
                streamWriter.Close();
            }

            var httpResponse = (HttpWebResponse)httpWebRequest.GetResponse();
            using (var streamReader = new StreamReader(httpResponse.GetResponseStream()))
            {
                var result = streamReader.ReadToEnd();
                textboxeditar.Text = "Proveedor editado correctamente";
            }
        }

        private void button5_Click(object sender, EventArgs e)
        {
            resultadoBox.Text = "";
            var httpWebRequest = (HttpWebRequest)WebRequest.Create("http://localhost:9090/enviarpublicidad");
            httpWebRequest.ContentType = "application/json";
            httpWebRequest.Method = "POST";

            using (var streamWriter = new StreamWriter(httpWebRequest.GetRequestStream()))
            {
                string json = "{\"in\":\"Compra!!!!\"}";

                streamWriter.Write(json);
                streamWriter.Flush();
                streamWriter.Close();
            }

            var httpResponse = (HttpWebResponse)httpWebRequest.GetResponse();
            using (var streamReader = new StreamReader(httpResponse.GetResponseStream()))
            {
                var result = streamReader.ReadLine();
                resultadoBox.Text = "Publicidad enviada correctamente";
            }
        }

        private void button6_Click(object sender, EventArgs e)
        {
            resultadoBox.Text = "";
            var httpWebRequest = (HttpWebRequest)WebRequest.Create("http://localhost:9090/suscripcion");
            httpWebRequest.ContentType = "application/json";
            httpWebRequest.Method = "POST";

            using (var streamWriter = new StreamWriter(httpWebRequest.GetRequestStream()))
            {
                string json = "{\"in\":\"Compra!!!!\"}";

                streamWriter.Write(json);
                streamWriter.Flush();
                streamWriter.Close();
            }

            var httpResponse = (HttpWebResponse)httpWebRequest.GetResponse();
            using (var streamReader = new StreamReader(httpResponse.GetResponseStream()))
            {
                var result = streamReader.ReadLine();
                resultadoBox.Text = "Ofertas enviadas a los suscriptores correctamente";
            }
        }
    }
}
