# NITF-core
NITF - MIL-STD-2500C - National Imagery Transmission Format

This is the core repo which contains the common types and structures within
NITF.  This DFDL schema project is meant to be linked against by other schema
projects that use NITF envelopes to contain other well defined data, such as
Raster images.

Schemas that will use this NITF core repo will be expected to provide a schema
file that implements the following types:

 - taggedRecordExtension
 - imageData

These implementations should reside within a schema defined at
com/tresys/nitf/xsd/nitf_extension_types.dfdl.xsd

Examples can be seen in the dfdl-nitf repo, which uses hexBinary elements for
these extensions, or in the dfdl-raster repo, which provides a structured schema
for Raster image data embedded within NITF.
