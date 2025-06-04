# VehicleLeaseAnalyzer: CO₂ and Cost Estimator for Leased Vehicles

This project implements a Java-based system to evaluate the environmental and financial impact of vehicle leases. It parses structured vehicle data from a file, classifies vehicles as gas or electric, and calculates their fuel cost, total lease cost, and carbon dioxide emissions over the lease duration.

This tool is especially useful for comparing lease options based not only on cost but also environmental impact—helping consumers or analysts make more informed decisions.

---

## 📁 Project Structure

| File              | Description |
|-------------------|-------------|
| `Vehicle.java`    | Represents a vehicle and stores computed cost and emissions data |
| `Fuel.java`       | Encapsulates fuel type (gas or electric), fuel efficiency, and charger cost |
| `Lease.java`      | Holds lease terms such as due at signing, lease length, and monthly cost |
| `LeasingCost.java`| Main controller that parses input data, constructs objects, performs calculations, and prints results |
| `vehicles.txt`    | Input file containing vehicle lease data in a custom semicolon-delimited format |
| `StdIn.java`      | Utility class for input parsing (used for reading `vehicles.txt`) |
| `StdOut.java`     | Utility class for formatted console output |
| `RecursiveAppend.java` | Optional file, unrelated to lease computation logic |

---

## 🛠️ Features

- Supports both **gasoline** and **electric** vehicles
- Computes the following for each vehicle:
  - Total lease cost over the full duration
  - Fuel cost based on lease mileage and fuel price
  - Estimated CO₂ emissions during the lease
- Modular object-oriented architecture with clear separation of responsibilities
- Flexible input parsing regardless of fragment order
- Includes logic for electric-only costs (e.g., charger fee)

---

## 🧾 Input Format (`vehicles.txt`)

- The first line: number of vehicles (integer)
- Each subsequent line: unordered key-value pairs separated by semicolons (`;`)
- Required fields:  
  `type`, `name`, `due`, `length`, `monthly`, `mile/unit`, `allowance`  
  Optional field for electric vehicles: `charger`
  
