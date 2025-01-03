# UnitConverterSpringBoot
UnitConverter application provides a RESTful API for converting between different units of measurement across categories like Length, Volume, Weight, and Temperature.

Technologies:

    Spring Boot for building the API
    Java for backend logic
    Enums to manage quantities and conversion factors
    DTOs for structured data exchange

API Endpoints:

    GET /api/converter/main-quantities: List all main quantity categories (Length, Volume, Weight, Temperature).
    GET /api/converter/sub-quantities/{mainQuantity}: List units for a specific main quantity.
    POST /api/converter/convert: Convert between units.
