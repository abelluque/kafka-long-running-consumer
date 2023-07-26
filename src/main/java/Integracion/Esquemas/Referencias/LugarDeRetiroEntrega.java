/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Integracion.Esquemas.Referencias;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class LugarDeRetiroEntrega extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1989007905365934771L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LugarDeRetiroEntrega\",\"namespace\":\"Integracion.Esquemas.Referencias\",\"fields\":[{\"name\":\"datosSucursal\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"DatosSucursal\",\"fields\":[{\"name\":\"codigo\",\"type\":\"string\"},{\"name\":\"nombre\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"id\",\"type\":\"string\"}]}],\"default\":null},{\"name\":\"domicilio\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Direccion\",\"fields\":[{\"name\":\"abreviaturaProvincia\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"calle\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"codigoDeDireccion\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"codigoCiudad\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"codigoPostal\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"nombreProvincia\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"numero\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"telefono\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"codigoISOProvincia\",\"type\":[\"null\",\"string\"],\"doc\":\"segun ISO -3166-2 (https://es.wikipedia.org/wiki/ISO_3166-2:AR)\",\"default\":null},{\"name\":\"codigoISOPais\",\"type\":[\"null\",\"string\"],\"doc\":\"segun ISO 3166-1 alpha-2 (https://es.wikipedia.org/wiki/ISO_3166-1#Tabla_de_c.C3.B3digos_alfa-2_asignados_o_reservados)\",\"default\":null},{\"name\":\"localidad\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"componentesDeDireccion\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"default\":null},{\"name\":\"coordenadas\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"GeoReferencia\",\"fields\":[{\"name\":\"latitud\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"longitud\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"altura\",\"type\":[\"null\",\"double\"],\"default\":null}]}],\"default\":null}]}],\"default\":null},{\"name\":\"codigoPostal\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"descripcion\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"localidad\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"esLocal\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"pais\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"region\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<LugarDeRetiroEntrega> ENCODER =
      new BinaryMessageEncoder<LugarDeRetiroEntrega>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<LugarDeRetiroEntrega> DECODER =
      new BinaryMessageDecoder<LugarDeRetiroEntrega>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<LugarDeRetiroEntrega> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<LugarDeRetiroEntrega> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<LugarDeRetiroEntrega> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<LugarDeRetiroEntrega>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this LugarDeRetiroEntrega to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a LugarDeRetiroEntrega from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a LugarDeRetiroEntrega instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static LugarDeRetiroEntrega fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private Integracion.Esquemas.Referencias.DatosSucursal datosSucursal;
   private Integracion.Esquemas.Referencias.Direccion domicilio;
   private java.lang.CharSequence codigoPostal;
   private java.lang.CharSequence descripcion;
   private java.lang.CharSequence localidad;
   private java.lang.CharSequence esLocal;
   private java.lang.CharSequence pais;
   private java.lang.CharSequence region;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public LugarDeRetiroEntrega() {}

  /**
   * All-args constructor.
   * @param datosSucursal The new value for datosSucursal
   * @param domicilio The new value for domicilio
   * @param codigoPostal The new value for codigoPostal
   * @param descripcion The new value for descripcion
   * @param localidad The new value for localidad
   * @param esLocal The new value for esLocal
   * @param pais The new value for pais
   * @param region The new value for region
   */
  public LugarDeRetiroEntrega(Integracion.Esquemas.Referencias.DatosSucursal datosSucursal, Integracion.Esquemas.Referencias.Direccion domicilio, java.lang.CharSequence codigoPostal, java.lang.CharSequence descripcion, java.lang.CharSequence localidad, java.lang.CharSequence esLocal, java.lang.CharSequence pais, java.lang.CharSequence region) {
    this.datosSucursal = datosSucursal;
    this.domicilio = domicilio;
    this.codigoPostal = codigoPostal;
    this.descripcion = descripcion;
    this.localidad = localidad;
    this.esLocal = esLocal;
    this.pais = pais;
    this.region = region;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return datosSucursal;
    case 1: return domicilio;
    case 2: return codigoPostal;
    case 3: return descripcion;
    case 4: return localidad;
    case 5: return esLocal;
    case 6: return pais;
    case 7: return region;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: datosSucursal = (Integracion.Esquemas.Referencias.DatosSucursal)value$; break;
    case 1: domicilio = (Integracion.Esquemas.Referencias.Direccion)value$; break;
    case 2: codigoPostal = (java.lang.CharSequence)value$; break;
    case 3: descripcion = (java.lang.CharSequence)value$; break;
    case 4: localidad = (java.lang.CharSequence)value$; break;
    case 5: esLocal = (java.lang.CharSequence)value$; break;
    case 6: pais = (java.lang.CharSequence)value$; break;
    case 7: region = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'datosSucursal' field.
   * @return The value of the 'datosSucursal' field.
   */
  public Integracion.Esquemas.Referencias.DatosSucursal getDatosSucursal() {
    return datosSucursal;
  }


  /**
   * Sets the value of the 'datosSucursal' field.
   * @param value the value to set.
   */
  public void setDatosSucursal(Integracion.Esquemas.Referencias.DatosSucursal value) {
    this.datosSucursal = value;
  }

  /**
   * Gets the value of the 'domicilio' field.
   * @return The value of the 'domicilio' field.
   */
  public Integracion.Esquemas.Referencias.Direccion getDomicilio() {
    return domicilio;
  }


  /**
   * Sets the value of the 'domicilio' field.
   * @param value the value to set.
   */
  public void setDomicilio(Integracion.Esquemas.Referencias.Direccion value) {
    this.domicilio = value;
  }

  /**
   * Gets the value of the 'codigoPostal' field.
   * @return The value of the 'codigoPostal' field.
   */
  public java.lang.CharSequence getCodigoPostal() {
    return codigoPostal;
  }


  /**
   * Sets the value of the 'codigoPostal' field.
   * @param value the value to set.
   */
  public void setCodigoPostal(java.lang.CharSequence value) {
    this.codigoPostal = value;
  }

  /**
   * Gets the value of the 'descripcion' field.
   * @return The value of the 'descripcion' field.
   */
  public java.lang.CharSequence getDescripcion() {
    return descripcion;
  }


  /**
   * Sets the value of the 'descripcion' field.
   * @param value the value to set.
   */
  public void setDescripcion(java.lang.CharSequence value) {
    this.descripcion = value;
  }

  /**
   * Gets the value of the 'localidad' field.
   * @return The value of the 'localidad' field.
   */
  public java.lang.CharSequence getLocalidad() {
    return localidad;
  }


  /**
   * Sets the value of the 'localidad' field.
   * @param value the value to set.
   */
  public void setLocalidad(java.lang.CharSequence value) {
    this.localidad = value;
  }

  /**
   * Gets the value of the 'esLocal' field.
   * @return The value of the 'esLocal' field.
   */
  public java.lang.CharSequence getEsLocal() {
    return esLocal;
  }


  /**
   * Sets the value of the 'esLocal' field.
   * @param value the value to set.
   */
  public void setEsLocal(java.lang.CharSequence value) {
    this.esLocal = value;
  }

  /**
   * Gets the value of the 'pais' field.
   * @return The value of the 'pais' field.
   */
  public java.lang.CharSequence getPais() {
    return pais;
  }


  /**
   * Sets the value of the 'pais' field.
   * @param value the value to set.
   */
  public void setPais(java.lang.CharSequence value) {
    this.pais = value;
  }

  /**
   * Gets the value of the 'region' field.
   * @return The value of the 'region' field.
   */
  public java.lang.CharSequence getRegion() {
    return region;
  }


  /**
   * Sets the value of the 'region' field.
   * @param value the value to set.
   */
  public void setRegion(java.lang.CharSequence value) {
    this.region = value;
  }

  /**
   * Creates a new LugarDeRetiroEntrega RecordBuilder.
   * @return A new LugarDeRetiroEntrega RecordBuilder
   */
  public static Integracion.Esquemas.Referencias.LugarDeRetiroEntrega.Builder newBuilder() {
    return new Integracion.Esquemas.Referencias.LugarDeRetiroEntrega.Builder();
  }

  /**
   * Creates a new LugarDeRetiroEntrega RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new LugarDeRetiroEntrega RecordBuilder
   */
  public static Integracion.Esquemas.Referencias.LugarDeRetiroEntrega.Builder newBuilder(Integracion.Esquemas.Referencias.LugarDeRetiroEntrega.Builder other) {
    if (other == null) {
      return new Integracion.Esquemas.Referencias.LugarDeRetiroEntrega.Builder();
    } else {
      return new Integracion.Esquemas.Referencias.LugarDeRetiroEntrega.Builder(other);
    }
  }

  /**
   * Creates a new LugarDeRetiroEntrega RecordBuilder by copying an existing LugarDeRetiroEntrega instance.
   * @param other The existing instance to copy.
   * @return A new LugarDeRetiroEntrega RecordBuilder
   */
  public static Integracion.Esquemas.Referencias.LugarDeRetiroEntrega.Builder newBuilder(Integracion.Esquemas.Referencias.LugarDeRetiroEntrega other) {
    if (other == null) {
      return new Integracion.Esquemas.Referencias.LugarDeRetiroEntrega.Builder();
    } else {
      return new Integracion.Esquemas.Referencias.LugarDeRetiroEntrega.Builder(other);
    }
  }

  /**
   * RecordBuilder for LugarDeRetiroEntrega instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LugarDeRetiroEntrega>
    implements org.apache.avro.data.RecordBuilder<LugarDeRetiroEntrega> {

    private Integracion.Esquemas.Referencias.DatosSucursal datosSucursal;
    private Integracion.Esquemas.Referencias.DatosSucursal.Builder datosSucursalBuilder;
    private Integracion.Esquemas.Referencias.Direccion domicilio;
    private Integracion.Esquemas.Referencias.Direccion.Builder domicilioBuilder;
    private java.lang.CharSequence codigoPostal;
    private java.lang.CharSequence descripcion;
    private java.lang.CharSequence localidad;
    private java.lang.CharSequence esLocal;
    private java.lang.CharSequence pais;
    private java.lang.CharSequence region;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Integracion.Esquemas.Referencias.LugarDeRetiroEntrega.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.datosSucursal)) {
        this.datosSucursal = data().deepCopy(fields()[0].schema(), other.datosSucursal);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasDatosSucursalBuilder()) {
        this.datosSucursalBuilder = Integracion.Esquemas.Referencias.DatosSucursal.newBuilder(other.getDatosSucursalBuilder());
      }
      if (isValidValue(fields()[1], other.domicilio)) {
        this.domicilio = data().deepCopy(fields()[1].schema(), other.domicilio);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasDomicilioBuilder()) {
        this.domicilioBuilder = Integracion.Esquemas.Referencias.Direccion.newBuilder(other.getDomicilioBuilder());
      }
      if (isValidValue(fields()[2], other.codigoPostal)) {
        this.codigoPostal = data().deepCopy(fields()[2].schema(), other.codigoPostal);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.descripcion)) {
        this.descripcion = data().deepCopy(fields()[3].schema(), other.descripcion);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.localidad)) {
        this.localidad = data().deepCopy(fields()[4].schema(), other.localidad);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.esLocal)) {
        this.esLocal = data().deepCopy(fields()[5].schema(), other.esLocal);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.pais)) {
        this.pais = data().deepCopy(fields()[6].schema(), other.pais);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.region)) {
        this.region = data().deepCopy(fields()[7].schema(), other.region);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
    }

    /**
     * Creates a Builder by copying an existing LugarDeRetiroEntrega instance
     * @param other The existing instance to copy.
     */
    private Builder(Integracion.Esquemas.Referencias.LugarDeRetiroEntrega other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.datosSucursal)) {
        this.datosSucursal = data().deepCopy(fields()[0].schema(), other.datosSucursal);
        fieldSetFlags()[0] = true;
      }
      this.datosSucursalBuilder = null;
      if (isValidValue(fields()[1], other.domicilio)) {
        this.domicilio = data().deepCopy(fields()[1].schema(), other.domicilio);
        fieldSetFlags()[1] = true;
      }
      this.domicilioBuilder = null;
      if (isValidValue(fields()[2], other.codigoPostal)) {
        this.codigoPostal = data().deepCopy(fields()[2].schema(), other.codigoPostal);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.descripcion)) {
        this.descripcion = data().deepCopy(fields()[3].schema(), other.descripcion);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.localidad)) {
        this.localidad = data().deepCopy(fields()[4].schema(), other.localidad);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.esLocal)) {
        this.esLocal = data().deepCopy(fields()[5].schema(), other.esLocal);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.pais)) {
        this.pais = data().deepCopy(fields()[6].schema(), other.pais);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.region)) {
        this.region = data().deepCopy(fields()[7].schema(), other.region);
        fieldSetFlags()[7] = true;
      }
    }

    /**
      * Gets the value of the 'datosSucursal' field.
      * @return The value.
      */
    public Integracion.Esquemas.Referencias.DatosSucursal getDatosSucursal() {
      return datosSucursal;
    }


    /**
      * Sets the value of the 'datosSucursal' field.
      * @param value The value of 'datosSucursal'.
      * @return This builder.
      */
    public Integracion.Esquemas.Referencias.LugarDeRetiroEntrega.Builder setDatosSucursal(Integracion.Esquemas.Referencias.DatosSucursal value) {
      validate(fields()[0], value);
      this.datosSucursalBuilder = null;
      this.datosSucursal = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'datosSucursal' field has been set.
      * @return True if the 'datosSucursal' field has been set, false otherwise.
      */
    public boolean hasDatosSucursal() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'datosSucursal' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public Integracion.Esquemas.Referencias.DatosSucursal.Builder getDatosSucursalBuilder() {
      if (datosSucursalBuilder == null) {
        if (hasDatosSucursal()) {
          setDatosSucursalBuilder(Integracion.Esquemas.Referencias.DatosSucursal.newBuilder(datosSucursal));
        } else {
          setDatosSucursalBuilder(Integracion.Esquemas.Referencias.DatosSucursal.newBuilder());
        }
      }
      return datosSucursalBuilder;
    }

    /**
     * Sets the Builder instance for the 'datosSucursal' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public Integracion.Esquemas.Referencias.LugarDeRetiroEntrega.Builder setDatosSucursalBuilder(Integracion.Esquemas.Referencias.DatosSucursal.Builder value) {
      clearDatosSucursal();
      datosSucursalBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'datosSucursal' field has an active Builder instance
     * @return True if the 'datosSucursal' field has an active Builder instance
     */
    public boolean hasDatosSucursalBuilder() {
      return datosSucursalBuilder != null;
    }

    /**
      * Clears the value of the 'datosSucursal' field.
      * @return This builder.
      */
    public Integracion.Esquemas.Referencias.LugarDeRetiroEntrega.Builder clearDatosSucursal() {
      datosSucursal = null;
      datosSucursalBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'domicilio' field.
      * @return The value.
      */
    public Integracion.Esquemas.Referencias.Direccion getDomicilio() {
      return domicilio;
    }


    /**
      * Sets the value of the 'domicilio' field.
      * @param value The value of 'domicilio'.
      * @return This builder.
      */
    public Integracion.Esquemas.Referencias.LugarDeRetiroEntrega.Builder setDomicilio(Integracion.Esquemas.Referencias.Direccion value) {
      validate(fields()[1], value);
      this.domicilioBuilder = null;
      this.domicilio = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'domicilio' field has been set.
      * @return True if the 'domicilio' field has been set, false otherwise.
      */
    public boolean hasDomicilio() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'domicilio' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public Integracion.Esquemas.Referencias.Direccion.Builder getDomicilioBuilder() {
      if (domicilioBuilder == null) {
        if (hasDomicilio()) {
          setDomicilioBuilder(Integracion.Esquemas.Referencias.Direccion.newBuilder(domicilio));
        } else {
          setDomicilioBuilder(Integracion.Esquemas.Referencias.Direccion.newBuilder());
        }
      }
      return domicilioBuilder;
    }

    /**
     * Sets the Builder instance for the 'domicilio' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public Integracion.Esquemas.Referencias.LugarDeRetiroEntrega.Builder setDomicilioBuilder(Integracion.Esquemas.Referencias.Direccion.Builder value) {
      clearDomicilio();
      domicilioBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'domicilio' field has an active Builder instance
     * @return True if the 'domicilio' field has an active Builder instance
     */
    public boolean hasDomicilioBuilder() {
      return domicilioBuilder != null;
    }

    /**
      * Clears the value of the 'domicilio' field.
      * @return This builder.
      */
    public Integracion.Esquemas.Referencias.LugarDeRetiroEntrega.Builder clearDomicilio() {
      domicilio = null;
      domicilioBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'codigoPostal' field.
      * @return The value.
      */
    public java.lang.CharSequence getCodigoPostal() {
      return codigoPostal;
    }


    /**
      * Sets the value of the 'codigoPostal' field.
      * @param value The value of 'codigoPostal'.
      * @return This builder.
      */
    public Integracion.Esquemas.Referencias.LugarDeRetiroEntrega.Builder setCodigoPostal(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.codigoPostal = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'codigoPostal' field has been set.
      * @return True if the 'codigoPostal' field has been set, false otherwise.
      */
    public boolean hasCodigoPostal() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'codigoPostal' field.
      * @return This builder.
      */
    public Integracion.Esquemas.Referencias.LugarDeRetiroEntrega.Builder clearCodigoPostal() {
      codigoPostal = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'descripcion' field.
      * @return The value.
      */
    public java.lang.CharSequence getDescripcion() {
      return descripcion;
    }


    /**
      * Sets the value of the 'descripcion' field.
      * @param value The value of 'descripcion'.
      * @return This builder.
      */
    public Integracion.Esquemas.Referencias.LugarDeRetiroEntrega.Builder setDescripcion(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.descripcion = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'descripcion' field has been set.
      * @return True if the 'descripcion' field has been set, false otherwise.
      */
    public boolean hasDescripcion() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'descripcion' field.
      * @return This builder.
      */
    public Integracion.Esquemas.Referencias.LugarDeRetiroEntrega.Builder clearDescripcion() {
      descripcion = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'localidad' field.
      * @return The value.
      */
    public java.lang.CharSequence getLocalidad() {
      return localidad;
    }


    /**
      * Sets the value of the 'localidad' field.
      * @param value The value of 'localidad'.
      * @return This builder.
      */
    public Integracion.Esquemas.Referencias.LugarDeRetiroEntrega.Builder setLocalidad(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.localidad = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'localidad' field has been set.
      * @return True if the 'localidad' field has been set, false otherwise.
      */
    public boolean hasLocalidad() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'localidad' field.
      * @return This builder.
      */
    public Integracion.Esquemas.Referencias.LugarDeRetiroEntrega.Builder clearLocalidad() {
      localidad = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'esLocal' field.
      * @return The value.
      */
    public java.lang.CharSequence getEsLocal() {
      return esLocal;
    }


    /**
      * Sets the value of the 'esLocal' field.
      * @param value The value of 'esLocal'.
      * @return This builder.
      */
    public Integracion.Esquemas.Referencias.LugarDeRetiroEntrega.Builder setEsLocal(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.esLocal = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'esLocal' field has been set.
      * @return True if the 'esLocal' field has been set, false otherwise.
      */
    public boolean hasEsLocal() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'esLocal' field.
      * @return This builder.
      */
    public Integracion.Esquemas.Referencias.LugarDeRetiroEntrega.Builder clearEsLocal() {
      esLocal = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'pais' field.
      * @return The value.
      */
    public java.lang.CharSequence getPais() {
      return pais;
    }


    /**
      * Sets the value of the 'pais' field.
      * @param value The value of 'pais'.
      * @return This builder.
      */
    public Integracion.Esquemas.Referencias.LugarDeRetiroEntrega.Builder setPais(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.pais = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'pais' field has been set.
      * @return True if the 'pais' field has been set, false otherwise.
      */
    public boolean hasPais() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'pais' field.
      * @return This builder.
      */
    public Integracion.Esquemas.Referencias.LugarDeRetiroEntrega.Builder clearPais() {
      pais = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'region' field.
      * @return The value.
      */
    public java.lang.CharSequence getRegion() {
      return region;
    }


    /**
      * Sets the value of the 'region' field.
      * @param value The value of 'region'.
      * @return This builder.
      */
    public Integracion.Esquemas.Referencias.LugarDeRetiroEntrega.Builder setRegion(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.region = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'region' field has been set.
      * @return True if the 'region' field has been set, false otherwise.
      */
    public boolean hasRegion() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'region' field.
      * @return This builder.
      */
    public Integracion.Esquemas.Referencias.LugarDeRetiroEntrega.Builder clearRegion() {
      region = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public LugarDeRetiroEntrega build() {
      try {
        LugarDeRetiroEntrega record = new LugarDeRetiroEntrega();
        if (datosSucursalBuilder != null) {
          try {
            record.datosSucursal = this.datosSucursalBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("datosSucursal"));
            throw e;
          }
        } else {
          record.datosSucursal = fieldSetFlags()[0] ? this.datosSucursal : (Integracion.Esquemas.Referencias.DatosSucursal) defaultValue(fields()[0]);
        }
        if (domicilioBuilder != null) {
          try {
            record.domicilio = this.domicilioBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("domicilio"));
            throw e;
          }
        } else {
          record.domicilio = fieldSetFlags()[1] ? this.domicilio : (Integracion.Esquemas.Referencias.Direccion) defaultValue(fields()[1]);
        }
        record.codigoPostal = fieldSetFlags()[2] ? this.codigoPostal : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.descripcion = fieldSetFlags()[3] ? this.descripcion : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.localidad = fieldSetFlags()[4] ? this.localidad : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.esLocal = fieldSetFlags()[5] ? this.esLocal : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.pais = fieldSetFlags()[6] ? this.pais : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.region = fieldSetFlags()[7] ? this.region : (java.lang.CharSequence) defaultValue(fields()[7]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<LugarDeRetiroEntrega>
    WRITER$ = (org.apache.avro.io.DatumWriter<LugarDeRetiroEntrega>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<LugarDeRetiroEntrega>
    READER$ = (org.apache.avro.io.DatumReader<LugarDeRetiroEntrega>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.datosSucursal == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.datosSucursal.customEncode(out);
    }

    if (this.domicilio == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.domicilio.customEncode(out);
    }

    if (this.codigoPostal == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.codigoPostal);
    }

    if (this.descripcion == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.descripcion);
    }

    if (this.localidad == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.localidad);
    }

    if (this.esLocal == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.esLocal);
    }

    if (this.pais == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.pais);
    }

    if (this.region == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.region);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.datosSucursal = null;
      } else {
        if (this.datosSucursal == null) {
          this.datosSucursal = new Integracion.Esquemas.Referencias.DatosSucursal();
        }
        this.datosSucursal.customDecode(in);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.domicilio = null;
      } else {
        if (this.domicilio == null) {
          this.domicilio = new Integracion.Esquemas.Referencias.Direccion();
        }
        this.domicilio.customDecode(in);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.codigoPostal = null;
      } else {
        this.codigoPostal = in.readString(this.codigoPostal instanceof Utf8 ? (Utf8)this.codigoPostal : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.descripcion = null;
      } else {
        this.descripcion = in.readString(this.descripcion instanceof Utf8 ? (Utf8)this.descripcion : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.localidad = null;
      } else {
        this.localidad = in.readString(this.localidad instanceof Utf8 ? (Utf8)this.localidad : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.esLocal = null;
      } else {
        this.esLocal = in.readString(this.esLocal instanceof Utf8 ? (Utf8)this.esLocal : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.pais = null;
      } else {
        this.pais = in.readString(this.pais instanceof Utf8 ? (Utf8)this.pais : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.region = null;
      } else {
        this.region = in.readString(this.region instanceof Utf8 ? (Utf8)this.region : null);
      }

    } else {
      for (int i = 0; i < 8; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.datosSucursal = null;
          } else {
            if (this.datosSucursal == null) {
              this.datosSucursal = new Integracion.Esquemas.Referencias.DatosSucursal();
            }
            this.datosSucursal.customDecode(in);
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.domicilio = null;
          } else {
            if (this.domicilio == null) {
              this.domicilio = new Integracion.Esquemas.Referencias.Direccion();
            }
            this.domicilio.customDecode(in);
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.codigoPostal = null;
          } else {
            this.codigoPostal = in.readString(this.codigoPostal instanceof Utf8 ? (Utf8)this.codigoPostal : null);
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.descripcion = null;
          } else {
            this.descripcion = in.readString(this.descripcion instanceof Utf8 ? (Utf8)this.descripcion : null);
          }
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.localidad = null;
          } else {
            this.localidad = in.readString(this.localidad instanceof Utf8 ? (Utf8)this.localidad : null);
          }
          break;

        case 5:
          if (in.readIndex() != 1) {
            in.readNull();
            this.esLocal = null;
          } else {
            this.esLocal = in.readString(this.esLocal instanceof Utf8 ? (Utf8)this.esLocal : null);
          }
          break;

        case 6:
          if (in.readIndex() != 1) {
            in.readNull();
            this.pais = null;
          } else {
            this.pais = in.readString(this.pais instanceof Utf8 ? (Utf8)this.pais : null);
          }
          break;

        case 7:
          if (in.readIndex() != 1) {
            in.readNull();
            this.region = null;
          } else {
            this.region = in.readString(this.region instanceof Utf8 ? (Utf8)this.region : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









