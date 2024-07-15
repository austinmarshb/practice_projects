//subscribe

// document.addEventListener("DOMContentLoaded", function() {
//   var button = document.getElementById("subscribeButton");

//   button.addEventListener("click", function() {
//     alert("Thanks for subscribing!");
//   });
// });

// //learn more
// document.addEventListener("DOMContentLoaded", function() {
//   var button = document.getElementById("learn-more");

//   button.addEventListener("click", function() {
//     alert("Plus you get friendly service whenever you shop with us!");
//   });
// });

let cartTotal = 0;

document.addEventListener("DOMContentLoaded", function() {
  var button = document.getElementById("cartButton");

  button.addEventListener("click", function() {
    cartTotal++;
    alert("Added to cart!");
  });
});

document.addEventListener("DOMContentLoaded", function() {
  var button = document.getElementById("cartButton2");

  button.addEventListener("click", function() {
    cartTotal++;
    alert("Added to cart!");
  });
});

document.addEventListener("DOMContentLoaded", function() {
  var button = document.getElementById("cartButton3");

  button.addEventListener("click", function() {
    cartTotal++;
    alert("Added to cart!");
  });
});

document.addEventListener("DOMContentLoaded", function() {
  var button = document.getElementById("cartButton4");

  button.addEventListener("click", function() {
    cartTotal++;
    alert("Added to cart!");
  });
});

document.addEventListener("DOMContentLoaded", function() {
  var button = document.getElementById("cartButton5");

  button.addEventListener("click", function() {
    cartTotal++;
    alert("Added to cart!");
  });
});

document.addEventListener("DOMContentLoaded", function() {
  var button = document.getElementById("cartButton6");

  button.addEventListener("click", function() {
    cartTotal++;
    alert("Added to cart!");
  });
});

document.addEventListener("DOMContentLoaded", function() {
  var button = document.getElementById("cartButton7");

  button.addEventListener("click", function() {
    cartTotal++;
    alert("Added to cart!");
  });
});

document.addEventListener("DOMContentLoaded", function() {
  var button = document.getElementById("cartButton8");

  button.addEventListener("click", function() {
    cartTotal++;
    alert("Added to cart!");
  });
});

document.addEventListener("DOMContentLoaded", function() {
  var button = document.getElementById("cartButton9");

  button.addEventListener("click", function() {
    cartTotal++;
    alert("Added to cart!");
  });
});

//cart stuff from here

//view cart
// document.addEventListener("DOMContentLoaded", function() {
//   var button = document.getElementById("viewCart");

//   button.addEventListener("click", function() {
//     alert("Here is your cart:");
//   });
// });

// //clear cart
// document.addEventListener("DOMContentLoaded", function() {
//   var button = document.getElementById("clearCart");

//   button.addEventListener("click", function() {
//     if (cartTotal > 0) {
//       cartTotal = 0;
//       alert("Cart cleared");
//       // Additional logic to clear the cart can be added here
//     } else if (cartTotal == 0) {
//       alert("No items to clear");
//     }
//   });
// });

// //submit cart
// document.addEventListener("DOMContentLoaded", function() {
//   var button = document.getElementById("submitCart");

//   button.addEventListener("click", function() {
//     alert("Thanks for your order!");
//   });
// });

//thanks for message
// document.addEventListener("DOMContentLoaded", function() {
//   var button = document.getElementById("thxSubmit");
//   var firstname = document.getElementById("name");
//   var lastname = document.getElementById("lastname");
//   var email = document.getElementById("email");
//   var message = document.getElementById("message");

//   button.addEventListener("click", function(event) {
//     event.preventDefault(); // Prevent the default form submission

//     if (firstname.value === '' || lastname.value === '' || email.value. === '' || message.value === '') {
//       alert('Please fill out all fields');
//     } else {
//       alert("Thanks for your message!");
//     }
//   });
// });

document.addEventListener("DOMContentLoaded", function() {
    // Initialize cart from session storage if available, otherwise empty array
    var cart = JSON.parse(sessionStorage.getItem('cart')) || [];

    var modal = document.getElementById("cartModal");
    var viewCartButton = document.getElementById("viewCart");
    var clearCartButton = document.getElementById("clearCart");
    var submitCartButton = document.getElementById("submitCart");
    var span = document.getElementsByClassName("close")[0];
    var cartItems = document.getElementById("cartItems");
    var clearCartButton1 = document.getElementById("clearCart1");
    var submitCartButton1 = document.getElementById("submitCart1");

  
    // Function to save cart to session storage
    function saveCart() {
        sessionStorage.setItem('cart', JSON.stringify(cart));
    }

    // Function to update the modal content with cart items
    function updateCartModal() {
        if (cart.length === 0) {
            cartItems.textContent = "Your cart is empty.";
        } else {
            cartItems.innerHTML = "Items in your cart:<br>" + cart.join('<br>');
        }
    }

    // When the user clicks the "View Cart" button, open the modal
    viewCartButton.onclick = function() {
        updateCartModal();
        modal.style.display = "block";
    }

    // When the user clicks on <span> (x), close the modal
    span.onclick = function() {
        modal.style.display = "none";
    }

    // When the user clicks anywhere outside of the modal, close it
    window.onclick = function(event) {
        if (event.target == modal) {
            modal.style.display = "none";
        }
    }

    // When the user clicks the "Clear Cart" button, clear the cart and show an alert
    clearCartButton.onclick = function() {
        cart = [];
        saveCart();
        alert("Your cart is now empty.");
        updateCartModal();
    }

    // When the user clicks the "Submit Order" button, submit the order
    submitCartButton.onclick = function() {
        if (cart.length === 0) {
            alert("Your cart is empty.");
        } else {
            alert("Order submitted: " + cart.join(', '));
            cart = [];
            saveCart();
            updateCartModal();
        }
    }

  // When the user clicks the "Clear Cart" button, clear the cart and show an alert
  clearCartButton1.onclick = function() {
      cart = [];
      saveCart();
      alert("Your cart is now empty.");
      updateCartModal();
  }

  // When the user clicks the "Submit Order" button, submit the order
  submitCartButton1.onclick = function() {
      if (cart.length === 0) {
          alert("Your cart is empty.");
      } else {
          alert("Order submitted: " + cart.join(', '));
          cart = [];
          saveCart();
          updateCartModal();
      }
  }

    // Add to Cart functionality
    var addToCartButtons = document.getElementsByClassName("add-to-cart");
    for (var i = 0; i < addToCartButtons.length; i++) {
        addToCartButtons[i].addEventListener("click", function() {
            var product = this.getAttribute("data-product");
            cart.push(product);
            saveCart();
            alert(product + " has been added to your cart.");
        });
    }
});

document.addEventListener("DOMContentLoaded", function() {
    // Get form elements
    var firstname = document.getElementById("firstname");
    var lastname = document.getElementById("lastname");
    var email = document.getElementById("email");
    var message = document.getElementById("message");
    var contactForm = document.getElementById("contactForm");

    // Load form data from session storage
    if (sessionStorage.getItem('contactFormData')) {
        var formData = JSON.parse(sessionStorage.getItem('contactFormData'));
        firstname.value = formData.firstname || '';
        lastname.value = formData.lastname || '';
        email.value = formData.email || '';
        message.value = formData.message || '';
    }

    // Save form data to session storage
    function saveFormData() {
        var formData = {
            firstname: firstname.value,
            lastname: lastname.value,
            email: email.value,
            message: message.value
        };
        sessionStorage.setItem('contactFormData', JSON.stringify(formData));
    }

    // Add event listeners to save form data on input change
    firstname.addEventListener('input', saveFormData);
    lastname.addEventListener('input', saveFormData);
    email.addEventListener('input', saveFormData);
    message.addEventListener('input', saveFormData);

    // Handle form submission
    window.handleFormSubmit = function(event) {
        event.preventDefault();
        alert('Thank you for your message!');
        sessionStorage.removeItem('contactFormData'); // Clear form data from session storage
        contactForm.reset(); // Reset the form
    };
});
