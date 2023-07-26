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
public class Telefono extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3602379444157243277L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Telefono\",\"namespace\":\"Integracion.Esquemas.Referencias\",\"fields\":[{\"name\":\"tipo\",\"type\":{\"type\":\"enum\",\"name\":\"TipoDeTelefono\",\"symbols\":[\"trabajo\",\"celular\",\"casa\",\"otro\"]}},{\"name\":\"numero\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Telefono> ENCODER =
      new BinaryMessageEncoder<Telefono>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Telefono> DECODER =
      new BinaryMessageDecoder<Telefono>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Telefono> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Telefono> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Telefono> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Telefono>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Telefono to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Telefono from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Telefono instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Telefono fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private Integracion.Esquemas.Referencias.TipoDeTelefono tipo;
   private java.lang.CharSequence numero;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Telefono() {}

  /**
   * All-args constructor.
   * @param tipo The new value for tipo
   * @param numero The new value for numero
   */
  public Telefono(Integracion.Esquemas.Referencias.TipoDeTelefono tipo, java.lang.CharSequence numero) {
    this.tipo = tipo;
    this.numero = numero;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return tipo;
    case 1: return numero;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: tipo = (Integracion.Esquemas.Referencias.TipoDeTelefono)value$; break;
    case 1: numero = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'tipo' field.
   * @return The value of the 'tipo' field.
   */
  public Integracion.Esquemas.Referencias.TipoDeTelefono getTipo() {
    return tipo;
  }


  /**
   * Sets the value of the 'tipo' field.
   * @param value the value to set.
   */
  public void setTipo(Integracion.Esquemas.Referencias.TipoDeTelefono value) {
    this.tipo = value;
  }

  /**
   * Gets the value of the 'numero' field.
   * @return The value of the 'numero' field.
   */
  public java.lang.CharSequence getNumero() {
    return numero;
  }


  /**
   * Sets the value of the 'numero' field.
   * @param value the value to set.
   */
  public void setNumero(java.lang.CharSequence value) {
    this.numero = value;
  }

  /**
   * Creates a new Telefono RecordBuilder.
   * @return A new Telefono RecordBuilder
   */
  public static Integracion.Esquemas.Referencias.Telefono.Builder newBuilder() {
    return new Integracion.Esquemas.Referencias.Telefono.Builder();
  }

  /**
   * Creates a new Telefono RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Telefono RecordBuilder
   */
  public static Integracion.Esquemas.Referencias.Telefono.Builder newBuilder(Integracion.Esquemas.Referencias.Telefono.Builder other) {
    if (other == null) {
      return new Integracion.Esquemas.Referencias.Telefono.Builder();
    } else {
      return new Integracion.Esquemas.Referencias.Telefono.Builder(other);
    }
  }

  /**
   * Creates a new Telefono RecordBuilder by copying an existing Telefono instance.
   * @param other The existing instance to copy.
   * @return A new Telefono RecordBuilder
   */
  public static Integracion.Esquemas.Referencias.Telefono.Builder newBuilder(Integracion.Esquemas.Referencias.Telefono other) {
    if (other == null) {
      return new Integracion.Esquemas.Referencias.Telefono.Builder();
    } else {
      return new Integracion.Esquemas.Referencias.Telefono.Builder(other);
    }
  }

  /**
   * RecordBuilder for Telefono instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Telefono>
    implements org.apache.avro.data.RecordBuilder<Telefono> {

    private Integracion.Esquemas.Referencias.TipoDeTelefono tipo;
    private java.lang.CharSequence numero;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Integracion.Esquemas.Referencias.Telefono.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.tipo)) {
        this.tipo = data().deepCopy(fields()[0].schema(), other.tipo);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.numero)) {
        this.numero = data().deepCopy(fields()[1].schema(), other.numero);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing Telefono instance
     * @param other The existing instance to copy.
     */
    private Builder(Integracion.Esquemas.Referencias.Telefono other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.tipo)) {
        this.tipo = data().deepCopy(fields()[0].schema(), other.tipo);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.numero)) {
        this.numero = data().deepCopy(fields()[1].schema(), other.numero);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'tipo' field.
      * @return The value.
      */
    public Integracion.Esquemas.Referencias.TipoDeTelefono getTipo() {
      return tipo;
    }


    /**
      * Sets the value of the 'tipo' field.
      * @param value The value of 'tipo'.
      * @return This builder.
      */
    public Integracion.Esquemas.Referencias.Telefono.Builder setTipo(Integracion.Esquemas.Referencias.TipoDeTelefono value) {
      validate(fields()[0], value);
      this.tipo = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'tipo' field has been set.
      * @return True if the 'tipo' field has been set, false otherwise.
      */
    public boolean hasTipo() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'tipo' field.
      * @return This builder.
      */
    public Integracion.Esquemas.Referencias.Telefono.Builder clearTipo() {
      tipo = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'numero' field.
      * @return The value.
      */
    public java.lang.CharSequence getNumero() {
      return numero;
    }


    /**
      * Sets the value of the 'numero' field.
      * @param value The value of 'numero'.
      * @return This builder.
      */
    public Integracion.Esquemas.Referencias.Telefono.Builder setNumero(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.numero = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'numero' field has been set.
      * @return True if the 'numero' field has been set, false otherwise.
      */
    public boolean hasNumero() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'numero' field.
      * @return This builder.
      */
    public Integracion.Esquemas.Referencias.Telefono.Builder clearNumero() {
      numero = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Telefono build() {
      try {
        Telefono record = new Telefono();
        record.tipo = fieldSetFlags()[0] ? this.tipo : (Integracion.Esquemas.Referencias.TipoDeTelefono) defaultValue(fields()[0]);
        record.numero = fieldSetFlags()[1] ? this.numero : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Telefono>
    WRITER$ = (org.apache.avro.io.DatumWriter<Telefono>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Telefono>
    READER$ = (org.apache.avro.io.DatumReader<Telefono>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeEnum(this.tipo.ordinal());

    out.writeString(this.numero);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.tipo = Integracion.Esquemas.Referencias.TipoDeTelefono.values()[in.readEnum()];

      this.numero = in.readString(this.numero instanceof Utf8 ? (Utf8)this.numero : null);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.tipo = Integracion.Esquemas.Referencias.TipoDeTelefono.values()[in.readEnum()];
          break;

        case 1:
          this.numero = in.readString(this.numero instanceof Utf8 ? (Utf8)this.numero : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










