import React from 'react'

const Signup = () => {
  return (
    <div className="h-screen flex justify-center bg-gray-100">
      <div className="max-w-md w-full p-4 bg-white rounded shadow-md">
        <p className="flex justify-center mb-4">
          <img src="./Images/Amazon_black.png" alt="" className="h-12 w-12" />
        </p>
        <div>
          <h1 className="text-3xl font-bold mb-4">Create Account</h1>
          <ul className="list-none mb-4">
            <li className="mb-2">
              <input
                type="text"
                placeholder="username"
                className="w-full p-2 pl-10 text-sm text-gray-700"
              />
            </li>
            <li className="mb-2">
              <input
                type="text"
                placeholder="mobile_number"
                className="w-full p-2 pl-10 text-sm text-gray-700"
              />
            </li>
            <li className="mb-2">
              <input
                type="text"
                placeholder="Password"
                className="w-full p-2 pl-10 text-sm text-gray-700"
              />
            </li>
            <li className="mb-2">
              <p className="text-xs text-gray-600">
                Passwords must be at least 6 characters.
              </p>
            </li>
            <li className="mb-2">
              <p className="text-xs text-gray-600">
                To verify your number, we will send you a text message with a
                temporary code. Message and data rates may apply.
              </p>
            </li>
          </ul>
          <button className="bg-yellow-500 hover:bg-yellow-600 text-white font-bold py-2 px-4 rounded">
            Verify mobile number
          </button>
          <div className="mt-4">
            <p className="text-sm text-gray-600">
              <b>Buying for work?</b>
            </p>
            <a
              href=""
              className="text-sm text-blue-600 hover:text-blue-800"
            >
              Create a free business account
            </a>
          </div>
          <p className="text-sm text-gray-600">
            Already have an account?
            <a href="" className="text-sm text-blue-600 hover:text-blue-800">
              Sign in
            </a>
          </p>
          <p className="text-xs text-gray-600">
            By creating an account or logging in, you agree to Amazon’s
            <a href="" className="text-sm text-blue-600 hover:text-blue-800">
              Conditions of Use
            </a>
            and
            <a href="" className="text-sm text-blue-600 hover:text-blue-800">
              Privacy Policy.
            </a>
          </p>
        </div>
        <div className="flex justify-center mt-4">
          <a
            href=""
            className="text-sm text-gray-600 hover:text-gray-800 mr-2"
          >
            Conditions of Use
          </a>
          <a
            href=""
            className="text-sm text-gray-600 hover:text-gray-800 mr-2"
          >
            Privacy Notice
          </a>
          <a
            href=""
            className="text-sm text-gray-600 hover:text-gray-800"
          >
            Help
          </a>
        </div>
        <p className="text-xs text-gray-600 mt-4">
          © 1996-2024, Amazon.com, Inc. or its affiliates
        </p>
      </div>
    </div>
  )
}

export default Signup