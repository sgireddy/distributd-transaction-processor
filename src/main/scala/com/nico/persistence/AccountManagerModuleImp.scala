/**
  * Created by anicolaspp on 7/2/16.
  */

package com.nico.persistence


//trait AccountManagerModuleImp extends AccountManagerModule {
//  this: AccountManager =>
//
//  class AccountManagerImp(account: String) extends AccountManager {
//
//    override def accountInfo: Account = this.get(account)
//
//    override def deposit(amount: Double): Account = {
//      val account = accountInfo
//
//      accountStorage.update(Account(account.id, account.balance + amount))
//    }
//
//    override def extract(amount: Double): (Boolean, Account) = {
//      val account = accountInfo
//
//      if (account.balance < amount){
//        (false, account)
//      }
//      else {
//        (true, accountStorage.update(Account(account.id, account.balance - amount)))
//      }
//    }
//  }
//}

//class InMemoryManager(account: String) extends AccountManagerModule with AccountStorageModule {
//  override val accountStorage = new AccountStorage {
//
//    var storedAccount = Account("100", 200)
//
//    override def get(accountId: String): Account = storedAccount
//
//    override def update(account: Account): Account = {
//      storedAccount = Account(storedAccount.id, account.balance)
//
//      storedAccount
//    }
//  }
//}
//
//object InMemoryManager {
//  def apply(account: String): InMemoryManager = new InMemoryManager(account)
//}
//




