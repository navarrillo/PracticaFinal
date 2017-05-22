using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Cliente
{
    
    class Reserva
    {
        
        public int id { get; set; }
        public DateTime fechaEntrada { get; set; }
        public DateTime fechaSalida { get; set; }
        public string nombreCliente { get; set; }
        public string emailCliente { get; set; }
        public double precio { get; set; }
        public bool ski { get; set; }
        public bool profesor { get; set; }
        public bool material { get; set; }
        public bool alojamiento { get; set; }
    }
}
