using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Cliente
{
    public partial class ModificarReserva : Form
    {
        gesReserva.ReservaEdicion reserva;
        public ModificarReserva(gesReserva.ReservaEdicion reservaEdit)
        {

            InitializeComponent();
            this.reserva = reservaEdit;
            tb_nombre.Text = reserva.nombreCliente;
            tb_email.Text = reserva.emailCliente;
            tb_fechaentrada.Text = reserva.fechaEntrada.ToString();
            tb_fechasalida.Text = reserva.fechaSalida.ToString();
            tb_precio.Text = reserva.precio.ToString();
            tb_ski.Text = reserva.ski.ToString();
            tb_material.Text = reserva.material.ToString();
            tb_alojamiento.Text = reserva.profesor.ToString();
            tb_profesor.Text = reserva.alojamiento.ToString();

        }

        private void button1_Click(object sender, EventArgs e)
        {
            /*Reserva res = new Reserva();
            res.nombreCliente = textBox1.Text;
            res.precio = 2.1;
            res.emailCliente = "dani_hawkb@hotmail.com";*/

           // string output = JsonConvert.SerializeObject(res);

           /* gesReserva.GestionReserva gesReserva = new gesReserva.GestionReserva();
            string salida;*/

            var httpWebRequest = (HttpWebRequest)WebRequest.Create("http://localhost:9090/gestionreserva");
            httpWebRequest.ContentType = "application/json";
            httpWebRequest.Method = "POST";
            
            int ski=1;
            int material=1;
            int profesor=1;
            int alojamiento=1;

            if (tb_ski.Text.ToString() == "False")
            {
                ski = 0;
            }
            if (tb_material.Text.ToString() == "False")
            {
                material = 0;
            }
            if (tb_profesor.Text.ToString() == "False")
            {
                profesor = 0;
            }
            if (tb_alojamiento.Text.ToString() == "False")
            {
                alojamiento = 0;
            }

            using (var streamWriter = new StreamWriter(httpWebRequest.GetRequestStream()))
            {

                string json = "{\"id\":" + reserva.id + "," +
                             "\"fechaEntrada\":  \"2017-05-23\"  ," +
                             "\"fechaSalida\":  \"2017-05-25\"  ," +
                             "\"nombreCliente\":\"" + tb_nombre.Text.ToString() + "\"," +
                             "\"emailCliente\":\"" + tb_email.Text.ToString() + "\"," +
                             "\"precio\":" + tb_precio.Text + "," +
                             "\"ski\":" + tb_ski.Text.ToString().ToLower() + "," +
                             "\"material\":" + "true" + "," +
                             "\"profesor\":" + "true" + "," +
                              "\"alojamiento\":" + "true" + "}";

                streamWriter.Write(json);
                streamWriter.Flush();
                streamWriter.Close();
            }

            var httpResponse = (HttpWebResponse)httpWebRequest.GetResponse();
            using (var streamReader = new StreamReader(httpResponse.GetResponseStream()))
            {
                var result = streamReader.ReadToEnd();
                MessageBox.Show(result);
            }
            /*using (var streamReader = new StreamReader(httpResponse.GetResponseStream()))
            {
                var result = streamReader.ReadToEnd();
                textBox4.Text = result;

                bool correcto = gesReserva.EditarReserva(reserva.id,reserva.fechaEntrada, reserva.fechaSalida,
                reserva.nombreCliente, reserva.emailCliente, reserva.precio,
                reserva.ski, reserva.material, reserva.profesor, reserva.alojamiento, out salida);
            MessageBox.Show(salida);*/

            this.Close();

        }

        private void button2_Click(object sender, EventArgs e)
        {

        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox7_TextChanged(object sender, EventArgs e)
        {

        }

        private void tb_nombre_TextChanged(object sender, EventArgs e)
        {

        }

        private void tb_precio_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
