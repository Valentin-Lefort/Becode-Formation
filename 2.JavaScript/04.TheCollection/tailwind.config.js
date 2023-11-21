/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["./**/*.{html,js}"],
  theme: {
    extend: {
      gridTemplateRows: {
        // Simple 8 row grid
        'col3': '0.3fr, 1fr, 0.1fr',

        // Complex site-specific row configuration
        'layout': '200px minmax(900px, 1fr) 100px',
    },
    fontSize: {
      '2xl': ['1.5rem', {
        lineHeight: '2rem',
        letterSpacing: '-0.01em',
        fontWeight: '500',
      }],
  },
  plugins: [],
}
}
}
