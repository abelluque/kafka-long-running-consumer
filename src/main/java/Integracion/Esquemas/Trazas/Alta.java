/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Integracion.Esquemas.Trazas;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Alta extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5617765136804376766L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Alta\",\"namespace\":\"Integracion.Esquemas.Trazas\",\"fields\":[{\"name\":\"traza\",\"type\":{\"type\":\"record\",\"name\":\"Traza\",\"namespace\":\"Integracion.Esquemas\",\"fields\":[{\"name\":\"codigoDeEnvio\",\"type\":\"string\"},{\"name\":\"nombre\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"cuando\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}},{\"name\":\"codigoDeContratoInterno\",\"type\":\"string\"},{\"name\":\"estadoDelEnvio\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"cicloDelEnvio\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"operador\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"estadoDeLaRendicion\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"comentario\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"sucursalAsociadaAlEvento\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"DatosSucursal\",\"namespace\":\"Integracion.Esquemas.Referencias\",\"fields\":[{\"name\":\"codigo\",\"type\":\"string\"},{\"name\":\"nombre\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"id\",\"type\":\"string\"}]}],\"default\":null}]}},{\"name\":\"envio\",\"type\":{\"type\":\"record\",\"name\":\"DetalleDeEnvio\",\"namespace\":\"Integracion.Esquemas.Referencias\",\"fields\":[{\"name\":\"fechaDeRecibo\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"informaTarifa\",\"type\":\"boolean\"},{\"name\":\"lote\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"numeroDeEnvio\",\"type\":\"string\"},{\"name\":\"numeroDeRecibo\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"numeroInformeDeRendicion\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"peso\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"pesoAforado\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"valorDeclarado\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"valorACobrar\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"volumen\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"origen\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"LugarDeRetiroEntrega\",\"fields\":[{\"name\":\"datosSucursal\",\"type\":[\"null\",\"DatosSucursal\"],\"default\":null},{\"name\":\"domicilio\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Direccion\",\"fields\":[{\"name\":\"abreviaturaProvincia\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"calle\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"codigoDeDireccion\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"codigoCiudad\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"codigoPostal\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"nombreProvincia\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"numero\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"telefono\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"codigoISOProvincia\",\"type\":[\"null\",\"string\"],\"doc\":\"segun ISO -3166-2 (https://es.wikipedia.org/wiki/ISO_3166-2:AR)\",\"default\":null},{\"name\":\"codigoISOPais\",\"type\":[\"null\",\"string\"],\"doc\":\"segun ISO 3166-1 alpha-2 (https://es.wikipedia.org/wiki/ISO_3166-1#Tabla_de_c.C3.B3digos_alfa-2_asignados_o_reservados)\",\"default\":null},{\"name\":\"localidad\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"componentesDeDireccion\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"default\":null},{\"name\":\"coordenadas\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"GeoReferencia\",\"fields\":[{\"name\":\"latitud\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"longitud\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"altura\",\"type\":[\"null\",\"double\"],\"default\":null}]}],\"default\":null}]}],\"default\":null},{\"name\":\"codigoPostal\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"descripcion\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"localidad\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"esLocal\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"pais\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"region\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"sucursalOrigen\",\"type\":[\"null\",\"LugarDeRetiroEntrega\"],\"default\":null},{\"name\":\"destino\",\"type\":\"LugarDeRetiroEntrega\"},{\"name\":\"sucursalDestino\",\"type\":[\"null\",\"LugarDeRetiroEntrega\"],\"default\":null},{\"name\":\"categoriaDeFacturacion\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"centroDeCostosDelCliente\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"estado\",\"type\":\"string\"},{\"name\":\"codigoDeContratoInterno\",\"type\":\"string\"},{\"name\":\"fechaInformeDeRendicion\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"fechaAltaEnvio\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"ordenDeCompraCliente\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"tarifa\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"componentes\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"DatosPersonales\",\"fields\":[{\"name\":\"numeroDeDocumento\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"nombreCompleto\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"idInternoDelCliente\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"eMail\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"telefonos\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Telefono\",\"fields\":[{\"name\":\"tipo\",\"type\":{\"type\":\"enum\",\"name\":\"TipoDeTelefono\",\"symbols\":[\"trabajo\",\"celular\",\"casa\",\"otro\"]}},{\"name\":\"numero\",\"type\":\"string\"}]}}],\"default\":null},{\"name\":\"agrupador\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"tipoDeDocumento\",\"type\":{\"type\":\"enum\",\"name\":\"TipoDeDocumento\",\"symbols\":[\"undefined\",\"DNI\",\"CUIT\",\"CUIL\"]}}]}}},{\"name\":\"destinatario\",\"type\":[\"null\",\"DatosPersonales\"],\"default\":null},{\"name\":\"remitente\",\"type\":[\"null\",\"DatosPersonales\"],\"default\":null},{\"name\":\"cantidadDeBultos\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"fechaProbableDeEntrega\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"observaciones\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"numeroDeRemito\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"numeroDeSeguimientoDelCliente\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"datosAdicionales\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"default\":null},{\"name\":\"fechaPactadaDeEntrega\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"altoEnCm\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"anchoEnCm\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"largoEnCm\",\"type\":[\"null\",\"double\"],\"default\":null}]}},{\"name\":\"contrato\",\"type\":{\"type\":\"record\",\"name\":\"Contrato\",\"namespace\":\"Integracion.Esquemas.Referencias\",\"fields\":[{\"name\":\"codigoDeContratoInterno\",\"type\":\"string\"},{\"name\":\"descripcion\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"estaActivo\",\"type\":\"boolean\"},{\"name\":\"tipoDeServicio\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"codigoDeDireccion\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"codigoDeClienteInterno\",\"type\":\"string\"},{\"name\":\"vigenciaDesde\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"vigenciaHasta\",\"type\":[\"null\",\"string\"],\"default\":null}]}},{\"name\":\"cantidadDeBultos\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"agrupadorDeBultos\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"numeroDeBulto\",\"type\":[\"null\",\"int\"],\"default\":null}],\"aliases\":[\"AltaManual\",\"AltaAutomatica\",\"AltaRemota\",\"AltaConAnomalias\",\"AltaDeExcedente\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimestampMillisConversion());
  }

  private static final BinaryMessageEncoder<Alta> ENCODER =
      new BinaryMessageEncoder<Alta>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Alta> DECODER =
      new BinaryMessageDecoder<Alta>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Alta> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Alta> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Alta> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Alta>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Alta to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Alta from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Alta instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Alta fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private Integracion.Esquemas.Traza traza;
   private Integracion.Esquemas.Referencias.DetalleDeEnvio envio;
   private Integracion.Esquemas.Referencias.Contrato contrato;
   private java.lang.Integer cantidadDeBultos;
   private java.lang.CharSequence agrupadorDeBultos;
   private java.lang.Integer numeroDeBulto;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Alta() {}

  /**
   * All-args constructor.
   * @param traza The new value for traza
   * @param envio The new value for envio
   * @param contrato The new value for contrato
   * @param cantidadDeBultos The new value for cantidadDeBultos
   * @param agrupadorDeBultos The new value for agrupadorDeBultos
   * @param numeroDeBulto The new value for numeroDeBulto
   */
  public Alta(Integracion.Esquemas.Traza traza, Integracion.Esquemas.Referencias.DetalleDeEnvio envio, Integracion.Esquemas.Referencias.Contrato contrato, java.lang.Integer cantidadDeBultos, java.lang.CharSequence agrupadorDeBultos, java.lang.Integer numeroDeBulto) {
    this.traza = traza;
    this.envio = envio;
    this.contrato = contrato;
    this.cantidadDeBultos = cantidadDeBultos;
    this.agrupadorDeBultos = agrupadorDeBultos;
    this.numeroDeBulto = numeroDeBulto;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return traza;
    case 1: return envio;
    case 2: return contrato;
    case 3: return cantidadDeBultos;
    case 4: return agrupadorDeBultos;
    case 5: return numeroDeBulto;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: traza = (Integracion.Esquemas.Traza)value$; break;
    case 1: envio = (Integracion.Esquemas.Referencias.DetalleDeEnvio)value$; break;
    case 2: contrato = (Integracion.Esquemas.Referencias.Contrato)value$; break;
    case 3: cantidadDeBultos = (java.lang.Integer)value$; break;
    case 4: agrupadorDeBultos = (java.lang.CharSequence)value$; break;
    case 5: numeroDeBulto = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'traza' field.
   * @return The value of the 'traza' field.
   */
  public Integracion.Esquemas.Traza getTraza() {
    return traza;
  }


  /**
   * Sets the value of the 'traza' field.
   * @param value the value to set.
   */
  public void setTraza(Integracion.Esquemas.Traza value) {
    this.traza = value;
  }

  /**
   * Gets the value of the 'envio' field.
   * @return The value of the 'envio' field.
   */
  public Integracion.Esquemas.Referencias.DetalleDeEnvio getEnvio() {
    return envio;
  }


  /**
   * Sets the value of the 'envio' field.
   * @param value the value to set.
   */
  public void setEnvio(Integracion.Esquemas.Referencias.DetalleDeEnvio value) {
    this.envio = value;
  }

  /**
   * Gets the value of the 'contrato' field.
   * @return The value of the 'contrato' field.
   */
  public Integracion.Esquemas.Referencias.Contrato getContrato() {
    return contrato;
  }


  /**
   * Sets the value of the 'contrato' field.
   * @param value the value to set.
   */
  public void setContrato(Integracion.Esquemas.Referencias.Contrato value) {
    this.contrato = value;
  }

  /**
   * Gets the value of the 'cantidadDeBultos' field.
   * @return The value of the 'cantidadDeBultos' field.
   */
  public java.lang.Integer getCantidadDeBultos() {
    return cantidadDeBultos;
  }


  /**
   * Sets the value of the 'cantidadDeBultos' field.
   * @param value the value to set.
   */
  public void setCantidadDeBultos(java.lang.Integer value) {
    this.cantidadDeBultos = value;
  }

  /**
   * Gets the value of the 'agrupadorDeBultos' field.
   * @return The value of the 'agrupadorDeBultos' field.
   */
  public java.lang.CharSequence getAgrupadorDeBultos() {
    return agrupadorDeBultos;
  }


  /**
   * Sets the value of the 'agrupadorDeBultos' field.
   * @param value the value to set.
   */
  public void setAgrupadorDeBultos(java.lang.CharSequence value) {
    this.agrupadorDeBultos = value;
  }

  /**
   * Gets the value of the 'numeroDeBulto' field.
   * @return The value of the 'numeroDeBulto' field.
   */
  public java.lang.Integer getNumeroDeBulto() {
    return numeroDeBulto;
  }


  /**
   * Sets the value of the 'numeroDeBulto' field.
   * @param value the value to set.
   */
  public void setNumeroDeBulto(java.lang.Integer value) {
    this.numeroDeBulto = value;
  }

  /**
   * Creates a new Alta RecordBuilder.
   * @return A new Alta RecordBuilder
   */
  public static Integracion.Esquemas.Trazas.Alta.Builder newBuilder() {
    return new Integracion.Esquemas.Trazas.Alta.Builder();
  }

  /**
   * Creates a new Alta RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Alta RecordBuilder
   */
  public static Integracion.Esquemas.Trazas.Alta.Builder newBuilder(Integracion.Esquemas.Trazas.Alta.Builder other) {
    if (other == null) {
      return new Integracion.Esquemas.Trazas.Alta.Builder();
    } else {
      return new Integracion.Esquemas.Trazas.Alta.Builder(other);
    }
  }

  /**
   * Creates a new Alta RecordBuilder by copying an existing Alta instance.
   * @param other The existing instance to copy.
   * @return A new Alta RecordBuilder
   */
  public static Integracion.Esquemas.Trazas.Alta.Builder newBuilder(Integracion.Esquemas.Trazas.Alta other) {
    if (other == null) {
      return new Integracion.Esquemas.Trazas.Alta.Builder();
    } else {
      return new Integracion.Esquemas.Trazas.Alta.Builder(other);
    }
  }

  /**
   * RecordBuilder for Alta instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Alta>
    implements org.apache.avro.data.RecordBuilder<Alta> {

    private Integracion.Esquemas.Traza traza;
    private Integracion.Esquemas.Traza.Builder trazaBuilder;
    private Integracion.Esquemas.Referencias.DetalleDeEnvio envio;
    private Integracion.Esquemas.Referencias.DetalleDeEnvio.Builder envioBuilder;
    private Integracion.Esquemas.Referencias.Contrato contrato;
    private Integracion.Esquemas.Referencias.Contrato.Builder contratoBuilder;
    private java.lang.Integer cantidadDeBultos;
    private java.lang.CharSequence agrupadorDeBultos;
    private java.lang.Integer numeroDeBulto;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Integracion.Esquemas.Trazas.Alta.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.traza)) {
        this.traza = data().deepCopy(fields()[0].schema(), other.traza);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasTrazaBuilder()) {
        this.trazaBuilder = Integracion.Esquemas.Traza.newBuilder(other.getTrazaBuilder());
      }
      if (isValidValue(fields()[1], other.envio)) {
        this.envio = data().deepCopy(fields()[1].schema(), other.envio);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasEnvioBuilder()) {
        this.envioBuilder = Integracion.Esquemas.Referencias.DetalleDeEnvio.newBuilder(other.getEnvioBuilder());
      }
      if (isValidValue(fields()[2], other.contrato)) {
        this.contrato = data().deepCopy(fields()[2].schema(), other.contrato);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (other.hasContratoBuilder()) {
        this.contratoBuilder = Integracion.Esquemas.Referencias.Contrato.newBuilder(other.getContratoBuilder());
      }
      if (isValidValue(fields()[3], other.cantidadDeBultos)) {
        this.cantidadDeBultos = data().deepCopy(fields()[3].schema(), other.cantidadDeBultos);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.agrupadorDeBultos)) {
        this.agrupadorDeBultos = data().deepCopy(fields()[4].schema(), other.agrupadorDeBultos);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.numeroDeBulto)) {
        this.numeroDeBulto = data().deepCopy(fields()[5].schema(), other.numeroDeBulto);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing Alta instance
     * @param other The existing instance to copy.
     */
    private Builder(Integracion.Esquemas.Trazas.Alta other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.traza)) {
        this.traza = data().deepCopy(fields()[0].schema(), other.traza);
        fieldSetFlags()[0] = true;
      }
      this.trazaBuilder = null;
      if (isValidValue(fields()[1], other.envio)) {
        this.envio = data().deepCopy(fields()[1].schema(), other.envio);
        fieldSetFlags()[1] = true;
      }
      this.envioBuilder = null;
      if (isValidValue(fields()[2], other.contrato)) {
        this.contrato = data().deepCopy(fields()[2].schema(), other.contrato);
        fieldSetFlags()[2] = true;
      }
      this.contratoBuilder = null;
      if (isValidValue(fields()[3], other.cantidadDeBultos)) {
        this.cantidadDeBultos = data().deepCopy(fields()[3].schema(), other.cantidadDeBultos);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.agrupadorDeBultos)) {
        this.agrupadorDeBultos = data().deepCopy(fields()[4].schema(), other.agrupadorDeBultos);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.numeroDeBulto)) {
        this.numeroDeBulto = data().deepCopy(fields()[5].schema(), other.numeroDeBulto);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'traza' field.
      * @return The value.
      */
    public Integracion.Esquemas.Traza getTraza() {
      return traza;
    }


    /**
      * Sets the value of the 'traza' field.
      * @param value The value of 'traza'.
      * @return This builder.
      */
    public Integracion.Esquemas.Trazas.Alta.Builder setTraza(Integracion.Esquemas.Traza value) {
      validate(fields()[0], value);
      this.trazaBuilder = null;
      this.traza = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'traza' field has been set.
      * @return True if the 'traza' field has been set, false otherwise.
      */
    public boolean hasTraza() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'traza' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public Integracion.Esquemas.Traza.Builder getTrazaBuilder() {
      if (trazaBuilder == null) {
        if (hasTraza()) {
          setTrazaBuilder(Integracion.Esquemas.Traza.newBuilder(traza));
        } else {
          setTrazaBuilder(Integracion.Esquemas.Traza.newBuilder());
        }
      }
      return trazaBuilder;
    }

    /**
     * Sets the Builder instance for the 'traza' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public Integracion.Esquemas.Trazas.Alta.Builder setTrazaBuilder(Integracion.Esquemas.Traza.Builder value) {
      clearTraza();
      trazaBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'traza' field has an active Builder instance
     * @return True if the 'traza' field has an active Builder instance
     */
    public boolean hasTrazaBuilder() {
      return trazaBuilder != null;
    }

    /**
      * Clears the value of the 'traza' field.
      * @return This builder.
      */
    public Integracion.Esquemas.Trazas.Alta.Builder clearTraza() {
      traza = null;
      trazaBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'envio' field.
      * @return The value.
      */
    public Integracion.Esquemas.Referencias.DetalleDeEnvio getEnvio() {
      return envio;
    }


    /**
      * Sets the value of the 'envio' field.
      * @param value The value of 'envio'.
      * @return This builder.
      */
    public Integracion.Esquemas.Trazas.Alta.Builder setEnvio(Integracion.Esquemas.Referencias.DetalleDeEnvio value) {
      validate(fields()[1], value);
      this.envioBuilder = null;
      this.envio = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'envio' field has been set.
      * @return True if the 'envio' field has been set, false otherwise.
      */
    public boolean hasEnvio() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'envio' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public Integracion.Esquemas.Referencias.DetalleDeEnvio.Builder getEnvioBuilder() {
      if (envioBuilder == null) {
        if (hasEnvio()) {
          setEnvioBuilder(Integracion.Esquemas.Referencias.DetalleDeEnvio.newBuilder(envio));
        } else {
          setEnvioBuilder(Integracion.Esquemas.Referencias.DetalleDeEnvio.newBuilder());
        }
      }
      return envioBuilder;
    }

    /**
     * Sets the Builder instance for the 'envio' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public Integracion.Esquemas.Trazas.Alta.Builder setEnvioBuilder(Integracion.Esquemas.Referencias.DetalleDeEnvio.Builder value) {
      clearEnvio();
      envioBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'envio' field has an active Builder instance
     * @return True if the 'envio' field has an active Builder instance
     */
    public boolean hasEnvioBuilder() {
      return envioBuilder != null;
    }

    /**
      * Clears the value of the 'envio' field.
      * @return This builder.
      */
    public Integracion.Esquemas.Trazas.Alta.Builder clearEnvio() {
      envio = null;
      envioBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'contrato' field.
      * @return The value.
      */
    public Integracion.Esquemas.Referencias.Contrato getContrato() {
      return contrato;
    }


    /**
      * Sets the value of the 'contrato' field.
      * @param value The value of 'contrato'.
      * @return This builder.
      */
    public Integracion.Esquemas.Trazas.Alta.Builder setContrato(Integracion.Esquemas.Referencias.Contrato value) {
      validate(fields()[2], value);
      this.contratoBuilder = null;
      this.contrato = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'contrato' field has been set.
      * @return True if the 'contrato' field has been set, false otherwise.
      */
    public boolean hasContrato() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'contrato' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public Integracion.Esquemas.Referencias.Contrato.Builder getContratoBuilder() {
      if (contratoBuilder == null) {
        if (hasContrato()) {
          setContratoBuilder(Integracion.Esquemas.Referencias.Contrato.newBuilder(contrato));
        } else {
          setContratoBuilder(Integracion.Esquemas.Referencias.Contrato.newBuilder());
        }
      }
      return contratoBuilder;
    }

    /**
     * Sets the Builder instance for the 'contrato' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public Integracion.Esquemas.Trazas.Alta.Builder setContratoBuilder(Integracion.Esquemas.Referencias.Contrato.Builder value) {
      clearContrato();
      contratoBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'contrato' field has an active Builder instance
     * @return True if the 'contrato' field has an active Builder instance
     */
    public boolean hasContratoBuilder() {
      return contratoBuilder != null;
    }

    /**
      * Clears the value of the 'contrato' field.
      * @return This builder.
      */
    public Integracion.Esquemas.Trazas.Alta.Builder clearContrato() {
      contrato = null;
      contratoBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'cantidadDeBultos' field.
      * @return The value.
      */
    public java.lang.Integer getCantidadDeBultos() {
      return cantidadDeBultos;
    }


    /**
      * Sets the value of the 'cantidadDeBultos' field.
      * @param value The value of 'cantidadDeBultos'.
      * @return This builder.
      */
    public Integracion.Esquemas.Trazas.Alta.Builder setCantidadDeBultos(java.lang.Integer value) {
      validate(fields()[3], value);
      this.cantidadDeBultos = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'cantidadDeBultos' field has been set.
      * @return True if the 'cantidadDeBultos' field has been set, false otherwise.
      */
    public boolean hasCantidadDeBultos() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'cantidadDeBultos' field.
      * @return This builder.
      */
    public Integracion.Esquemas.Trazas.Alta.Builder clearCantidadDeBultos() {
      cantidadDeBultos = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'agrupadorDeBultos' field.
      * @return The value.
      */
    public java.lang.CharSequence getAgrupadorDeBultos() {
      return agrupadorDeBultos;
    }


    /**
      * Sets the value of the 'agrupadorDeBultos' field.
      * @param value The value of 'agrupadorDeBultos'.
      * @return This builder.
      */
    public Integracion.Esquemas.Trazas.Alta.Builder setAgrupadorDeBultos(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.agrupadorDeBultos = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'agrupadorDeBultos' field has been set.
      * @return True if the 'agrupadorDeBultos' field has been set, false otherwise.
      */
    public boolean hasAgrupadorDeBultos() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'agrupadorDeBultos' field.
      * @return This builder.
      */
    public Integracion.Esquemas.Trazas.Alta.Builder clearAgrupadorDeBultos() {
      agrupadorDeBultos = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'numeroDeBulto' field.
      * @return The value.
      */
    public java.lang.Integer getNumeroDeBulto() {
      return numeroDeBulto;
    }


    /**
      * Sets the value of the 'numeroDeBulto' field.
      * @param value The value of 'numeroDeBulto'.
      * @return This builder.
      */
    public Integracion.Esquemas.Trazas.Alta.Builder setNumeroDeBulto(java.lang.Integer value) {
      validate(fields()[5], value);
      this.numeroDeBulto = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'numeroDeBulto' field has been set.
      * @return True if the 'numeroDeBulto' field has been set, false otherwise.
      */
    public boolean hasNumeroDeBulto() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'numeroDeBulto' field.
      * @return This builder.
      */
    public Integracion.Esquemas.Trazas.Alta.Builder clearNumeroDeBulto() {
      numeroDeBulto = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Alta build() {
      try {
        Alta record = new Alta();
        if (trazaBuilder != null) {
          try {
            record.traza = this.trazaBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("traza"));
            throw e;
          }
        } else {
          record.traza = fieldSetFlags()[0] ? this.traza : (Integracion.Esquemas.Traza) defaultValue(fields()[0]);
        }
        if (envioBuilder != null) {
          try {
            record.envio = this.envioBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("envio"));
            throw e;
          }
        } else {
          record.envio = fieldSetFlags()[1] ? this.envio : (Integracion.Esquemas.Referencias.DetalleDeEnvio) defaultValue(fields()[1]);
        }
        if (contratoBuilder != null) {
          try {
            record.contrato = this.contratoBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("contrato"));
            throw e;
          }
        } else {
          record.contrato = fieldSetFlags()[2] ? this.contrato : (Integracion.Esquemas.Referencias.Contrato) defaultValue(fields()[2]);
        }
        record.cantidadDeBultos = fieldSetFlags()[3] ? this.cantidadDeBultos : (java.lang.Integer) defaultValue(fields()[3]);
        record.agrupadorDeBultos = fieldSetFlags()[4] ? this.agrupadorDeBultos : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.numeroDeBulto = fieldSetFlags()[5] ? this.numeroDeBulto : (java.lang.Integer) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Alta>
    WRITER$ = (org.apache.avro.io.DatumWriter<Alta>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Alta>
    READER$ = (org.apache.avro.io.DatumReader<Alta>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










