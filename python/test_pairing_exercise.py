import unittest
import pairing_exercise


class TestPairingExercise(unittest.TestCase):
    def test_unit_tests(self):
        # Example: assert something meaningful about the module
        self.assertTrue(len(pairing_exercise.name) > 0)

    def test_import(self):
        self.assertEqual(pairing_exercise.name, 'Pairing exercise')
