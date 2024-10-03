document.getElementById('calculate-tax').addEventListener('click', function() {
    // Get user input values
    const name = document.getElementById('name').value;
    const income = parseFloat(document.getElementById('income').value);
    const resultDiv = document.getElementById('result');

    // Check if both name and income are provided
    if (!name || isNaN(income) || income < 0) {
        resultDiv.innerHTML = "<p style='color: red;'>Please enter a valid name and income!</p>";
        return;
    }

    // Calculate tax based on income slabs
    let tax = 0;
    if (income <= 250000) {
        tax = 0; // No tax for income up to ₹2.5 lakhs
    } else if (income <= 500000) {
        tax = 0.05 * (income - 250000); // 5% tax on the amount above ₹2.5 lakhs
    } else if (income <= 1000000) {
        tax = 0.05 * 250000 + 0.2 * (income - 500000); // 20% on the amount above ₹5 lakhs
    } else {
        tax = 0.05 * 250000 + 0.2 * 500000 + 0.3 * (income - 1000000); // 30% on the amount above ₹10 lakhs
    }

    // Display the result
    resultDiv.innerHTML = `
        <p><strong>Name:</strong> ${name}</p>
        <p><strong>Annual Income:</strong> ₹${income}</p>
        <p><strong>Total Tax:</strong> ₹${tax.toFixed(2)}</p>
    `;
});
