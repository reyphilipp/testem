package bank

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import konto.IKonto
import org.junit.Assert.*
import org.junit.Test


class BankTest{
    @Test
    fun should_CallZahleEinMethod_when_IsEinbezahlt(){
        //Triple A
        // Arrange
        val iKonto : IKonto = mock()
        whenever(iKonto.zahleEin(44.8)).thenReturn("einbezahlt")
        val sut = Bank(iKonto)

        // Act
        sut.zahlEinTest()

        // Assert
        verify(iKonto).zahleEin(44.8)
    }



    @Test
    fun should_CallZahleEinMethod_when_IsNichtEinbezahlt(){
        //Triple A
        // Arrange
        val iKonto : IKonto = mock()
        whenever(iKonto.zahleEin(44.8)).thenReturn("nicht einbezahlt")
        val sut = Bank(iKonto)

        // Act
        sut.zahlEinTest()

        // Assert
        verify(iKonto).zahleEin(44.8)
    }

    @Test(expected = IllegalStateException::class)
    fun should_ThrowIllegalStateException_when_ErrorEinzahlen(){
        //Triple A
        // Arrange
        val iKonto : IKonto = mock()
        whenever(iKonto.zahleEin(44.8)).thenReturn("Error")
        val sut = Bank(iKonto)

        // Act
        sut.zahlEinTest()

        // Assert

    }
}